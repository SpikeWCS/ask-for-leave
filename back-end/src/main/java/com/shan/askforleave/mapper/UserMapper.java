package com.shan.askforleave.mapper;

import com.shan.askforleave.pojo.User;

import java.util.List;

public interface UserMapper {
    int add(User user);

    void delete(int id);

    User get(int id);

    int update(User user);

    List<User> list();

    User getByUsernameAndPassword(String username, String password);
}
