package com.h3c.zs.springbootdocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/user")
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello zhangshuai";
    }
}
