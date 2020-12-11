package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.base.Result;
import com.atguigu.springcloud.base.ResultUtil;
import com.atguigu.springcloud.dto.PaymentDTO;
import com.atguigu.springcloud.entity.PaymentEntity;
import com.atguigu.springcloud.mapper.PaymentMapper;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public Result<String> create(PaymentDTO paymentDTO) {
        PaymentEntity paymentEntity = PaymentDTO.parseEntity(paymentDTO, PaymentEntity.class);
        paymentMapper.insertUseGeneratedKeys(paymentEntity);
        return ResultUtil.returnSuccessResult();
    }
}
