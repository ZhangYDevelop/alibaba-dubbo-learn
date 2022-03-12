package com.zy.alibaba.order.service;

import com.zy.service.api.model.Order;
import com.zy.service.api.model.User;
import com.zy.service.api.order.IOrderService;
import com.zy.service.api.user.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @AUTHOR zhangy
 * 2022/3/12  10:24 下午
 */
@Service
public class OrderService implements IOrderService {

    @Reference()
    private IUserService userService;

    public Order createOrder() {
        User user = userService.queryUserByUserId("1");
        System.out.println(user.toString());
        return  new Order();
    }
}
