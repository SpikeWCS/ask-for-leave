package com.shan.askforleave.controller;

import com.shan.askforleave.pojo.Employee;
import com.shan.askforleave.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    /**
     * Restful 风格接口
     * @param uid
     * @return
     */
    @RequestMapping(value = "/employee/{uid}", method = RequestMethod.GET)
    @ResponseBody
    public Employee getEmployeeByUid(@PathVariable("uid") int uid) {
        System.out.println("id=====" + uid);
        Employee employee = employeeService.getByUid(uid);
        return employee;
    }

}
