package com.shan.askforleave.service;

import com.shan.askforleave.pojo.User;

import java.util.List;

public interface UserService {
    List<User> list();

    User getByUsernameAndPassword(String username, String password);
}
