package com.zy.dubbo.user.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.zy.dubbo.user.api.UserApi;
import com.zy.dubbo.user.api.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR zhangy
 * 2020-05-26  22:04
 */
@SpringBootApplication
@EnableDubbo
@RestController
@RequestMapping("/api")
public class SpringBootUserConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserConsumer.class, args);
    }

    @Reference
    private UserApi userApi;

    @GetMapping("/user")
    public User getInfo() {
        return userApi.queryUserByUserId("dfdf");
    }
}
