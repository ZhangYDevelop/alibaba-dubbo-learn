package com.zy.user.service.nacos.dubbo.service;


import com.zy.dubbo.user.api.UserApi;
import com.zy.dubbo.user.api.model.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @Reference
    private UserApi userApi;

    public User getUser() {
        return userApi.queryUserByUserId("dfdfd");
    }
}
