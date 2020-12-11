package com.atguigu.springcloud.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import javax.annotation.Resource;

public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
