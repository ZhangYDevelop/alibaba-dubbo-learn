package com.zy.dubbo.user.service.boot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zy.dubbo.user.api.IUserInfoDetail;

@Service
@SuppressWarnings("all")
public class UserDetaiulService implements IUserInfoDetail {
    public int getDetail() {
        return 8;
    }
}
