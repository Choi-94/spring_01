package com.icia.ex1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller    // 스프링 문법임 @는 대부분 스프링 문법
public class HomeController {
    @GetMapping("/") //=> /주소로 get 요청이 오는경우 이 메서드 실행
    public String index(){
        return "index";
    }
    // home 요청 처리
    @GetMapping("/home")
    public String home(){
        return "home";
    }

}
