package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.base.BaseMapper;
import com.atguigu.springcloud.entity.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMapper extends BaseMapper<PaymentEntity> {

    /**
     * 新增数据
     *
     * @param paymentEntity 实例对象
     * @return 影响行数
     */
    int insert(PaymentEntity paymentEntity);
}
