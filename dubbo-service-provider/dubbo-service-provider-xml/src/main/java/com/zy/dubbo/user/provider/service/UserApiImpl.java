package com.zy.dubbo.user.provider.service;

import com.zy.dubbo.user.api.UserApi;
import com.zy.dubbo.user.api.model.User;

/**
 * @AUTHOR zhangy
 * 2020-05-24  15:47
 */
public class UserApiImpl implements UserApi {
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
