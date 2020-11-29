package com.shan.askforleave.controller;

import com.shan.askforleave.pojo.User;
import com.shan.askforleave.service.UserService;
import com.shan.askforleave.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("login")
    @ResponseBody
    public Object login(@RequestParam("username") String username, @RequestParam("password") String password,
                        @RequestParam("role") int loginRole) {

        User user = userService.getByUsernameAndPassword(username, password);
        if(null == user) {

            String message = "password is wrong!!!";
            return Result.fail(message);

        }else {

            // 如果用户登录的非普通员工账号, 需要符合身份才行
            if( (loginRole != 0 && loginRole == user.getRole()) || loginRole == 0 ) {
                Result result = Result.success();
                result.setData(user);
                return result;
            } else {
                String message = "your role is wrong!!!";
                return Result.fail(message);
            }
        }
    }



    @RequestMapping("listUser")
    @ResponseBody
    public List<User> listUser() {
        List<User> userList = userService.list();
        return userList;
    }
}
