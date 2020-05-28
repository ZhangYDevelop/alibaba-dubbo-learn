package com.zy.user.service.nacos.cloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/nacos/config")
public class NacosConfig {

    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private int userAge;

    @Value("${user.city}")
    private String userCity;

    @GetMapping("userName")
    public String getUserName() {
        return "userName: "+userName + "userAge: " + userAge + "userCity:" + userCity;
    }
}