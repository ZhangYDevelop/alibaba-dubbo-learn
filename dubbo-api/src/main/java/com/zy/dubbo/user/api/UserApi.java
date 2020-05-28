package com.zy.dubbo.user.api;

import com.zy.dubbo.user.api.model.User;

import java.util.List;

/**
 * @AUTHOR zhangy
 * 2020-05-24  15:26
 */
public interface UserApi {

    int insertUser(User user);

    int modifyUser(User user);

    int deleteUser(String userId);

    User queryUserByUserId(String userId);

}
