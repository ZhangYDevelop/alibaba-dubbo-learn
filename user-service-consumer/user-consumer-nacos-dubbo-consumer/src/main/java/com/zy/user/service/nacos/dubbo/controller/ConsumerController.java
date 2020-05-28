package com.zy.user.service.nacos.dubbo.controller;

import com.zy.dubbo.user.api.model.User;
import com.zy.user.service.nacos.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/")
public class ConsumerController {

    @Autowired
    private UserService userService;
    @GetMapping("/getUser")
    public User getStr() {
      return  userService.getUser();
    }
}
