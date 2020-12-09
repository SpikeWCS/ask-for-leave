package com.shan.askforleave.controller;

import com.shan.askforleave.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminPageController {

    // 登录页面
    @RequestMapping("/login_page")
    public String login() {

        return "loginPage";
    }

    // 一般员工页面
    @RequestMapping("/employee_page")
    public String employee() {

        return "employeePage";
    }


    @RequestMapping("/little_manager_page")
    public String littleManager() {
        return "littleManagerPage";
    }
}
