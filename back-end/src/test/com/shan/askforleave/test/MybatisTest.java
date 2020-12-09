package com.shan.askforleave.test;

import com.shan.askforleave.mapper.UserMapper;
import com.shan.askforleave.pojo.User;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1() throws Exception{
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = df.parse("2020-12-01");
        Date date2 = df.parse("2020-12-04");

        System.out.println(date2.getTime() - date1.getTime());
    }
}
