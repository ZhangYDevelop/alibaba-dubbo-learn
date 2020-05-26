package com.zy.dubbo.user.service.boot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zy.dubbo.user.api.UserApi;
import com.zy.dubbo.user.api.model.User;
import org.springframework.beans.factory.annotation.Value;

/**
 * @AUTHOR zhangy
 * 2020-05-24  22:01
 */
@SuppressWarnings("all")
@Service
public class UserServiceBoot implements UserApi {

    @Value("@{dubbo.application.name}")
    private String serviceName;

    public int insertUser(User user) {
        return 0;
    }

    public int modifyUser(User user) {
        return 0;
    }

    public int deleteUser(String userId) {
        return 0;
    }

    public User queryUserByUserId(String userId) {
        User user  = new User();
        user.setAge(18);
        user.setCity("湖北恩施");
        user.setId("dkinnfiid");
        user.setName("zhangyu");
        return user;
    }
}
