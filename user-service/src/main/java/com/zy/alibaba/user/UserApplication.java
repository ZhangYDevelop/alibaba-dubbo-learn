package com.zy.alibaba.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @AUTHOR zhangy
 * 2022/3/12  9:26 下午
 */
@EnableFeignClients
@SpringBootApplication
@EnableDubbo
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
