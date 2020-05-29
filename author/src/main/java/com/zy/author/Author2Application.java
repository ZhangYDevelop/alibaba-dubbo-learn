package com.zy.author;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Author2Application {

    public static void main(String[] args) {
        SpringApplication.run(Author2Application.class, args);
    }
}
