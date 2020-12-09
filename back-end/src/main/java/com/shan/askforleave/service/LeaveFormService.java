package com.shan.askforleave.service;

import com.shan.askforleave.pojo.LeaveForm;

import java.util.List;

public interface LeaveFormService {

    int add(LeaveForm leaveForm);

    LeaveForm get(int id);

    List<LeaveForm> list();

    LeaveForm find(LeaveForm leaveForm);
}
