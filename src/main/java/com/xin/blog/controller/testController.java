package com.xin.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

@Controller
public class testController {
    @RequestMapping(value = "hello")
    @ResponseBody
    public String test1(){
        return "hello world";
    }
    @RequestMapping(value = "/form")
    public String test2(){
        return "/form";
    }
    @PostMapping(value = "/formDo")
    public String test3(String zhanghu, String mima, RedirectAttributes redirectAttributes, Model model){
        Map map =new HashMap();
        map.put("zhanghu",zhanghu);
        model.addAttribute("map",map);
        return "success";
    }
    @RequestMapping(value = "index1")
    public String test4(){
        return "index1";
    }
}
