package com.shan.askforleave.service;


import com.shan.askforleave.mapper.EmployeeMapper;
import com.shan.askforleave.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public Employee getByUid(int uid) {
        Employee employee = employeeMapper.getByUid(uid);
        System.out.println("get employee:" + employee);
        return employee;
    }


}
