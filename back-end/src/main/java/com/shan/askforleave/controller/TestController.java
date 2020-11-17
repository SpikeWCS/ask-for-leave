package com.shan.askforleave.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "aaa";
    }
}
