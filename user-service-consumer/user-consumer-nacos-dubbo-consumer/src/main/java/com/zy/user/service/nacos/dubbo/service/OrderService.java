package com.zy.user.service.nacos.dubbo.service;

import com.zy.dubbo.user.api.IOrder;
import com.zy.dubbo.user.api.model.Order;
import org.apache.dubbo.config.annotation.Service;
@SuppressWarnings("all")
@Service
public class OrderService  implements IOrder {
    public Order createOrder() {
        Order order = new Order();
        order.setCode("THS-dfdf-89089");
        order.setId("dfdllckvxjos");
        order.setMoney(234);
        return order;
    }
}
