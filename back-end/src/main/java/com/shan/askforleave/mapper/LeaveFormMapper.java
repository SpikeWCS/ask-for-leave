package com.shan.askforleave.mapper;

import com.shan.askforleave.pojo.LeaveForm;

import java.util.List;

public interface LeaveFormMapper {

    int add(LeaveForm leaveForm);
    LeaveForm get(int id);
    List<LeaveForm> list();
    LeaveForm find(LeaveForm leaveForm);
}
