package com.zy.alibaba.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @AUTHOR zhangy
 * 2022/3/12  9:27 下午
 */
@SpringBootApplication
@EnableFeignClients
@EnableDubbo
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
