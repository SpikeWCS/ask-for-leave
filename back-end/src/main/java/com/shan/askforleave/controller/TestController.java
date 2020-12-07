package com.shan.askforleave.controller;

import com.shan.askforleave.pojo.Employee;
import com.shan.askforleave.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
    @Autowired
    EmployeeService employeeService;


    @RequestMapping("/test")
    @ResponseBody
    public Employee test() {
        return employeeService.get(1);
    }
}
