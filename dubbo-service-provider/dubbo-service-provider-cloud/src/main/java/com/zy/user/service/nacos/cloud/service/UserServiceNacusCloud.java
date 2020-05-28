package com.zy.user.service.nacos.cloud.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zy.dubbo.user.api.UserApi;
import com.zy.dubbo.user.api.model.User;

@Service
@SuppressWarnings("all")
public class UserServiceNacusCloud implements UserApi {


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
