package com.shangcheng.duodian.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fangcong
 * @date: 2020/4/26
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "greeting to spring boot";
    }
}
