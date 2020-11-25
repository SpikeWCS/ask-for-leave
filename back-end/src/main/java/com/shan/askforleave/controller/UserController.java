package com.shan.askforleave.controller;

import com.shan.askforleave.pojo.User;
import com.shan.askforleave.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("listUser")
    @ResponseBody
    public List<User> listUser() {
        List<User> userList = userService.list();
        return userList;
    }
}
