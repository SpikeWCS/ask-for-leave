package com.shan.askforleave.mapper;

import com.shan.askforleave.pojo.LeaveStatus;

import java.util.List;

public interface LeaveStatusMapper {

    int add(LeaveStatus leaveStatus);
    List<LeaveStatus> getListByUid(int uid);
    LeaveStatus getBylfid(int lfid);
    int update(LeaveStatus leaveStatus);
}
