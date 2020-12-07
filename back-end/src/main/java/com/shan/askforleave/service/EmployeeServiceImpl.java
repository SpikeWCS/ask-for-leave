package com.shan.askforleave.service;


import com.shan.askforleave.mapper.EmployeeMapper;
import com.shan.askforleave.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
