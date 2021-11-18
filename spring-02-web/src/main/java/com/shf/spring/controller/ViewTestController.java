package com.shf.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {
    @GetMapping("/shf")
    public String shf(Model model){
//        model中的数据会被放在请求域中
        model.addAttribute("msg","hello thymeleaf");
        model.addAttribute("link","cn.bing.com");
        return "success";
    }
}
