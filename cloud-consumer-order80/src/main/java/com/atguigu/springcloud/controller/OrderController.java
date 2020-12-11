package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.base.Result;
import com.atguigu.springcloud.dto.PaymentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public Result<String> create(PaymentDTO paymentDTO){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",paymentDTO,Result.class);  //写操作
    }
}
