package com.shan.askforleave.controller;

import com.shan.askforleave.pojo.Employee;
import com.shan.askforleave.pojo.LeaveForm;
import com.shan.askforleave.service.EmployeeService;
import com.shan.askforleave.service.LeaveFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    LeaveFormService leaveFormService;

    @RequestMapping("/test")
    @ResponseBody
    public LeaveForm test() {
        return leaveFormService.get(1);
    }
}
