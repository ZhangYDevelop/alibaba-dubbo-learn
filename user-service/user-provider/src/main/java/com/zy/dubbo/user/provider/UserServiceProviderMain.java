package com.zy.dubbo.user.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @AUTHOR zhangy
 * 2020-05-24  16:09
 */
public class UserServiceProviderMain {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath*:/META-INF/user-provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
