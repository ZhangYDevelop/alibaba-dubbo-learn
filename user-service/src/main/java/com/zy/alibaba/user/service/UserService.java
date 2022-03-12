package com.zy.alibaba.user.service;

import com.zy.service.api.model.User;
import com.zy.service.api.user.IUserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @AUTHOR zhangy
 * 2022/3/12  10:32 下午
 */
@Service
public class UserService implements IUserService {
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
        User user = new User();
        user.setAge(12);
        user.setName("张三");
        return user;
    }
}
