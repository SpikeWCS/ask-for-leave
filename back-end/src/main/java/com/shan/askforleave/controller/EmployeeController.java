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
     * @param id
     * @return
     */
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Employee getEmployeeById(@PathVariable("id") int id) {
        System.out.println("id=====" + id);
        Employee employee = employeeService.get(id);
        return employee;
    }

}
