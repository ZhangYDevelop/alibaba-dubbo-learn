package com.zy.user.service.nacos.cloud.service;

import com.zy.dubbo.user.api.IOrder;
import com.zy.dubbo.user.api.model.Order;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Reference
    private IOrder orderService;

    public Order getOrder() {
        return orderService.createOrder();
    }
}
