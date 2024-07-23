package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * @author: zerboink
 * * @date 2024/7/23
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
