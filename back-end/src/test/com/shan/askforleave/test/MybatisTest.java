package com.shan.askforleave.test;

import com.shan.askforleave.mapper.UserMapper;
import com.shan.askforleave.pojo.User;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1() {
        System.out.println(userMapper);
        System.out.println(userMapper);
        List<User> cs=userMapper.list();
        for (User c : cs) {
            System.out.println(c.getName());
        }
    }
}
