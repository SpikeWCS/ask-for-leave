package com.shan.askforleave.controller;

import com.shan.askforleave.pojo.LeaveForm;
import com.shan.askforleave.service.LeaveFormService;
import com.shan.askforleave.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class LeaveFormController {
    @Autowired
    LeaveFormService leaveFormService;


    @PostMapping("/leaveform")
    @ResponseBody
    public Object add(@RequestBody LeaveForm leaveForm) {
        String title =  leaveForm.getTitle();
        title = HtmlUtils.htmlEscape(title);
        leaveForm.setTitle(title);
        System.out.println("post ++++" + leaveForm);

        int code = leaveFormService.add(leaveForm);

        Result result = Result.success();
        result.setData(code);

        return result;
    }
}
