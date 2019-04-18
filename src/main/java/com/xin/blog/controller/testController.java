package com.xin.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @RequestMapping(value = "hello")
    @ResponseBody
    public String test1(){
        return "hello world";
    }
}
