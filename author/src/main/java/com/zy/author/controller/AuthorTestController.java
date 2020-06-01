package com.zy.author.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author/test")
public class AuthorTestController {

    @RequestMapping("/chekc")
    public String getStr() {
        return "hello app";
    }
}
