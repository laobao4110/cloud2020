package com.atguigu.springcloud.service;

import com.atguigu.springcloud.base.Result;
import com.atguigu.springcloud.dto.PaymentDTO;

public interface PaymentService {
    /**
     * 创建记录
    * */
    Result<String> create(PaymentDTO paymentDTO);
}
