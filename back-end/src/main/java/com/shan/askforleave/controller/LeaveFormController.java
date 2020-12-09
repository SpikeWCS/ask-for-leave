package com.shan.askforleave.controller;

import com.shan.askforleave.pojo.LeaveForm;
import com.shan.askforleave.pojo.LeaveStatus;
import com.shan.askforleave.pojo.User;
import com.shan.askforleave.service.LeaveFormService;
import com.shan.askforleave.service.LeaveStatusService;
import com.shan.askforleave.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class LeaveFormController {
    @Autowired
    LeaveFormService leaveFormService;

    @Autowired
    LeaveStatusService leaveStatusService;

    /**
     * Restful 接口风格 post
     * @param leaveForm
     * @return
     */
    @PostMapping("/leaveform")
    @ResponseBody
    public Object add(@RequestBody LeaveForm leaveForm, HttpSession session) throws ParseException {
        String title =  leaveForm.getTitle();
        title = HtmlUtils.htmlEscape(title);
        leaveForm.setTitle(title);

        int code = leaveFormService.add(leaveForm);


        Result result = Result.success();
        result.setData(code);

        leaveForm = leaveFormService.find(leaveForm);
        System.out.println(leaveForm + "aaaaaaaaa");

        User user = (User) session.getAttribute("user");

        LeaveStatus newLeaveStatus = new LeaveStatus();
        newLeaveStatus.setLfid(leaveForm.getId());
        newLeaveStatus.setUid(user.getId());
        newLeaveStatus.setIsShort(isShort(leaveForm.getStartDate(), leaveForm.getEndDate()));
        newLeaveStatus.setIsFirst(0);
        newLeaveStatus.setIsSecond(0);
        newLeaveStatus.setReason("");
        newLeaveStatus.setStatus(0);
        leaveStatusService.add(newLeaveStatus);


        return result;
    }

    /**
     * Result 风格的 list
     * @return
     */
    @GetMapping("/leaveform")
    @ResponseBody
    public List<LeaveForm> list() {
        return leaveFormService.list();
    }

    public int isShort(String s1, String s2) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = df.parse(s1);
        Date date2 = df.parse(s2);

        if(date2.getTime() - date1.getTime() >= 259200000) {
            return 0;
        }else {
            return 1;
        }
    }

}
