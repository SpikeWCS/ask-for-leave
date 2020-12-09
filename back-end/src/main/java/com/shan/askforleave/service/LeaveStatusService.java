package com.shan.askforleave.service;

import com.shan.askforleave.pojo.LeaveStatus;

import java.util.List;


public interface LeaveStatusService {
    int add(LeaveStatus leaveStatus);

    int update(LeaveStatus leaveStatus);

    List<LeaveStatus> getListByUid(int uid);
}
