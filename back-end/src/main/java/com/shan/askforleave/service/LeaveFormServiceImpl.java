package com.shan.askforleave.service;

import com.shan.askforleave.mapper.LeaveFormMapper;
import com.shan.askforleave.pojo.LeaveForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveFormServiceImpl implements LeaveFormService{

    @Autowired
    LeaveFormMapper leaveFormMapper;

    @Override
    public int add(LeaveForm leaveForm) {
        return leaveFormMapper.add(leaveForm);
    }

    @Override
    public LeaveForm get(int id) {
        return leaveFormMapper.get(id);
    }

    @Override
    public List<LeaveForm> list() {
        return leaveFormMapper.list();
    }

    @Override
    public LeaveForm find(LeaveForm leaveForm) {
        return leaveFormMapper.find(leaveForm);
    }
}
