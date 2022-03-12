package com.zy.service.api.user;

import com.zy.service.api.model.User;

/**
 * @AUTHOR zhangy
 * 2020-05-24  15:26
 */
public interface IUserService {

    int insertUser(User user);

    int modifyUser(User user);

    int deleteUser(String userId);

    User queryUserByUserId(String userId);

}
