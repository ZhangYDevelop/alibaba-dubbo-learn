package com.zy.alibaba.order.controller;

import com.zy.alibaba.order.service.OrderService;
import com.zy.service.api.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @AUTHOR zhangy
 * 2022/3/12  10:34 下午
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/createOrder")
    public Order createOrder() {
        return orderService.createOrder();
    }
}
