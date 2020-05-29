package com.zy.dubbo.user.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zy.dubbo.user.api.UserApi;
import com.zy.dubbo.user.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceZk  {

    @Reference
    private UserApi userApi;

    public User getUser() {
        return userApi.queryUserByUserId("dfdf");
    }
}
