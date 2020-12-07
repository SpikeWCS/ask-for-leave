package com.shan.askforleave.service;

import com.shan.askforleave.pojo.Employee;

import java.util.List;

public interface EmployeeService {


    Employee get(int id);
    List<String> getSignInDatesById(int id);
    int getSignInDaysById(int id);  // 根据id获得连续签到时间

}
