package com.shan.askforleave.service;

import com.shan.askforleave.mapper.LeaveStatusMapper;
import com.shan.askforleave.pojo.LeaveStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveStatusServiceImpl implements LeaveStatusService {

    @Autowired
    LeaveStatusMapper leaveStatusMapper;

    @Override
    public int add(LeaveStatus leaveStatus) {
        int code = leaveStatusMapper.add(leaveStatus);
        return code;
    }

    @Override
    public int update(LeaveStatus leaveStatus) {
        int code = leaveStatusMapper.update(leaveStatus);
        return code;
    }

    @Override
    public List<LeaveStatus> getListByUid(int uid) {
        return leaveStatusMapper.getListByUid(uid);
    }
}
