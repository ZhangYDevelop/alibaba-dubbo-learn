package com.zy.dubbo.user.service.boot;

//import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @AUTHOR zhangy
 * 2020-05-24  19:54
 */
@SpringBootApplication
@EnableDubbo
public class UserServiceBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceBootApplication.class,args);
    }
}
