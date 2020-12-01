package com.shan.askforleave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminPageController {

    // 登录页面
    @RequestMapping("/login_page")
    public String login() {
        return "login";
    }

    // 一般员工页面
    @RequestMapping("/employee_page")
    public String employee() {
        return "employeePage";
    }

}