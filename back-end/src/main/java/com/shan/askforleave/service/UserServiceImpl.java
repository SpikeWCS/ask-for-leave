package com.shan.askforleave.service;

import com.shan.askforleave.mapper.UserMapper;
import com.shan.askforleave.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list() {
        System.out.println("usermapper:" + userMapper);
        User user = userMapper.get(1);
        System.out.println("user"+ user);
        return userMapper.list();
    }

    @Override
    public User getByUsernameAndPassword(String username, String password) {
        System.out.println("username: "+username+"   password: " + password);
        return userMapper.getByUsernameAndPassword(username, password);
    }
}
