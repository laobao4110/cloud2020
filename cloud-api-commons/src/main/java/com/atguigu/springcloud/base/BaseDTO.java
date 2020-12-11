package com.atguigu.springcloud.base;

import cn.hutool.core.collection.CollUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author lyz
 * @date 2019/1/4
 */
@Data
public abstract class BaseDTO {
	
    protected Integer id;
//    protected Integer dataStatus;
//    protected String remark;
//    protected String createUser;
//    protected Date createTime;
//    protected String updateUser;
//    protected Date updateTime;

    /**
     * 获取数据传输对象的id
     */
    public abstract Integer getDtoId();

    /**
     * 设置数据传输对象的id
     */
    public abstract void setDtoId(Integer dtoId);

    /**
     * 转换当前dto实例为entity
     * @param entityClass
     * @param <T>
     * @return
     * @author lyz
     */
    public <T extends BaseEntity> T toEntity(Class<T> entityClass) {
        T entityObj = JSONUtil.parseObject(this, entityClass);
        entityObj.setId(this.getDtoId());
        return entityObj;
    }
    /**
     * <p>
     * 将DTO转换为对应的实体类
     * </p>
     *
     * @param entityClass
     * @return T
     * @author lyz
     */
    public static  <T extends BaseEntity> T parseEntity(com.atguigu.springcloud.base.BaseDTO baseDTO, Class<T> entityClass) {
        T entityObj = JSONUtil.parseObject(baseDTO, entityClass);
        entityObj.setId(baseDTO.getDtoId());
        return entityObj;
    }

    /**
     * <p>
     * 将DTO列表转换为对应的实体类列表
     * </p>
     *
     * @param entityClass
     * @return java.util.List<T>
     * @author lyz
     */
    public static  <T extends BaseEntity> List<T> parseEntityArray(List<? extends BaseDTO> mallBaseDTOS, Class<T> entityClass) {
        List<T> entityArray = new ArrayList<>();
        if (CollUtil.isEmpty(mallBaseDTOS)) {
            return entityArray;
        }
        for (com.atguigu.springcloud.base.BaseDTO mallBaseDTO : mallBaseDTOS) {
            entityArray.add(mallBaseDTO.toEntity(entityClass));
        }
        return entityArray;
    }
}
