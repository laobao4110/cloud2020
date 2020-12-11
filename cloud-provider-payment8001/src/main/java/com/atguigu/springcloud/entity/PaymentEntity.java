package com.atguigu.springcloud.entity;

import com.atguigu.springcloud.base.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "payment")
public class PaymentEntity extends BaseEntity {
    @Column(name = "serial")
    private String serial; //流水号

}
