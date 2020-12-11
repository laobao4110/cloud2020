package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.base.Result;
import com.atguigu.springcloud.dto.CommonResult;
import com.atguigu.springcloud.dto.PaymentDTO;
import com.atguigu.springcloud.dto.PaymentDTO;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("get/{id}")
    public CommonResult<PaymentDTO> selectOne(@PathVariable("id") Long id) {
        PaymentDTO payment = new PaymentDTO();
        payment.setId(1);
        payment.setSerial("asdasdas11223");
        return new CommonResult<PaymentDTO>(200,"select success 8001!",payment);
    }


     /**
     * 创建记录
     * */
    @PostMapping("create")
    public Result<String> create(@RequestBody PaymentDTO paymentDTO) {
        return paymentService.create(paymentDTO);
    }

}
