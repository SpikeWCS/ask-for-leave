package com.shan.askforleave.controller;

import com.shan.askforleave.pojo.Employee;
import com.shan.askforleave.pojo.LeaveForm;
import com.shan.askforleave.pojo.LeaveStatus;
import com.shan.askforleave.service.EmployeeService;
import com.shan.askforleave.service.LeaveFormService;
import com.shan.askforleave.service.LeaveStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class TestController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    LeaveFormService leaveFormService;

    @Autowired
    LeaveStatusService leaveStatusService;
    @RequestMapping("/test")
    @ResponseBody
    public List<LeaveStatus> test() {
        return leaveStatusService.getListByUid(1);
    }
}
