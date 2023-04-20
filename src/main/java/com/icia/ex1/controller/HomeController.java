package com.icia.ex1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller    // 스프링 문법임 @는 대부분 스프링 문법
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
