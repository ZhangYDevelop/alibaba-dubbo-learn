package com.zy.alibaba.author.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author/test")
public class AuthorTestController {

    @RequestMapping("/token")
    public String getStr() {
        return "hello this api need token";
    }

    @RequestMapping("/noToken")
    public String getStrq() {
        return "hello no token";
    }
}
