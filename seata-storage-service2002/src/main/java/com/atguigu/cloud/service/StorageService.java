package com.atguigu.cloud.service;

/**
 * @author: zerboink
 * * @date 2024/7/23
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
