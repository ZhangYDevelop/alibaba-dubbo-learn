package com.zy.dubbo.user.consumer;

import com.zy.dubbo.user.api.UserApi;
import com.zy.dubbo.user.api.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @AUTHOR zhangy
 * 2020-05-24  18:05
 */
public class XmlOrderServiceMain {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath*:/META-INF/consumer.xml");
        applicationContext.start();

        UserApi userApi = (UserApi)applicationContext.getBean("userService");
        User user =  userApi.queryUserByUserId("dfd");
        System.out.println(user.toString());

    }
}
