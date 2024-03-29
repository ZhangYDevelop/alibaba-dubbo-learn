package com.zy.alibaba.author;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zy.author.mapper")
@EnableDubbo
public class Author2Application {

    public static void main(String[] args) {
        SpringApplication.run(Author2Application.class, args);
    }
}
