package com.yzh.wiki.controller;

import com.yzh.wiki.domian.Test;
import com.yzh.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Value("${test.name:yzhqss}")
    private String testHello;
    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }

    @PostMapping("/yzh")
    public String yzh(String name) {
        return "hello world" + name + testHello;
    }
}
