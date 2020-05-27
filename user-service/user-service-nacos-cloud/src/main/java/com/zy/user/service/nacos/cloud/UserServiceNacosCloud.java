package com.zy.user.service.nacos.cloud;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@EnableDubbo
public class UserServiceNacosCloud {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceNacosCloud.class, args);
    }
}
