package com.yzh.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @PostMapping("/yzh")
    public String yzh(String name){
        return "hello world"+name;
    }
}
