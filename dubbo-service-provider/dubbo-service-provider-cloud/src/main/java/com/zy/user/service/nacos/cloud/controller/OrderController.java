package com.zy.user.service.nacos.cloud.controller;

import com.zy.dubbo.user.api.model.Order;
import com.zy.user.service.nacos.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/createOrder")
    public Order createOrder() {
       return orderService.getOrder();
    }
}
