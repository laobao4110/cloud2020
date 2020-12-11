package com.atguigu.springcloud.dto;

import com.atguigu.springcloud.base.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO extends BaseDTO{

    private String serial;

    @Override
    public Integer getDtoId() {
        return null;
    }

    @Override
    public void setDtoId(Integer dtoId) {

    }
}
