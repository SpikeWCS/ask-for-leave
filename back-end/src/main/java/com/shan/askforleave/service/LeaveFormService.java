package com.shan.askforleave.service;

import com.shan.askforleave.pojo.LeaveForm;

public interface LeaveFormService {

    int add(LeaveForm leaveForm);

    LeaveForm get(int id);
}
