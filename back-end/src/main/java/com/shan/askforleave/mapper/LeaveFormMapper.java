package com.shan.askforleave.mapper;

import com.shan.askforleave.pojo.LeaveForm;

public interface LeaveFormMapper {

    int add(LeaveForm leaveForm);
    LeaveForm get(int id);
}
