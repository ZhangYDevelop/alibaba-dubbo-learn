package com.zy.author;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zy.author.mapper")
public class Author2Application {

    public static void main(String[] args) {
        SpringApplication.run(Author2Application.class, args);
    }
}
