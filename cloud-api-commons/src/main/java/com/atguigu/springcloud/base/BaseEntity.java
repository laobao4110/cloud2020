package com.atguigu.springcloud.base;

import cn.hutool.core.collection.CollUtil;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class BaseEntity  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Integer id;
//    protected Integer dataStatus;
//    protected String remark;
//    protected String createUser;
//    protected Date createTime;
//    protected String updateUser;
//    protected Date updateTime;

    /**
     * 转换当前实例对象为DTO对象
     * @param dtoClass
     * @param <T>
     * @return
     */
    public <T extends BaseDTO> T toDTO(Class<T> dtoClass) {
        T dtoObj = JSONUtil.parseObject(this, dtoClass);
        dtoObj.setDtoId(id);
        return dtoObj;
    }

    /**
     * <p>
     * 将实体对象转换为对应的数据传输对象
     * </p>
     *
     * @param dtoClass
     * @return T
     * @author lyz
     */
    public static <T extends BaseDTO> T parseDTO(BaseEntity entity, Class<T> dtoClass) {
        T dtoObj = JSONUtil.parseObject(entity, dtoClass);
        dtoObj.setDtoId(entity.getId());
        return dtoObj;
    }

    /**
     * <p>
     * 将实体列表转化为数据传输对象列表
     * </p>
     *
     * @param dtoClass
     * @return T
     * @author lyz
     */
    public static <T extends BaseDTO> List<T> parseDTOArray(List<? extends BaseEntity> entities, Class<T> dtoClass) {
        List<T> dtoArray = new ArrayList<>();
        if (CollUtil.isEmpty(entities)) {
            return dtoArray;
        }
        for (BaseEntity entity : entities) {
            dtoArray.add(entity.toDTO(dtoClass));
        }
        return dtoArray;
    }
}
