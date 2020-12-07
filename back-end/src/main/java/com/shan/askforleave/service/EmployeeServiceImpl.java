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
    public Employee get(int id) {
        Employee employee = employeeMapper.get(id);
        System.out.println("get employee:" + employee);
        return employeeMapper.get(id);
    }


    @Override
    public List<String> getSignInDatesById(int id) {

        Employee employee = employeeMapper.get(id);
        String[] dates = employee.getSignInDates().split(",");
        for(int i=0; i<dates.length; i++) {
            System.out.println(dates[i]);
        }

        List<String> list = Arrays.asList(dates);
        return list;
    }

    @Override
    public int getSignInDaysById(int id) {
        return 0;
    }
}
