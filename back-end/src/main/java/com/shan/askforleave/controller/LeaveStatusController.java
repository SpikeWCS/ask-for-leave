package com.shan.askforleave.controller;

import com.shan.askforleave.service.LeaveStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LeaveStatusController {
    @Autowired
    LeaveStatusService leaveStatusService;


}
