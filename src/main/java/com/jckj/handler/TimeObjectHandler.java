package com.jckj.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/18
 * @Description:
 */
@Slf4j//日志记录
@Component
public class TimeObjectHandler implements MetaObjectHandler
{
    //插入的时间自动填充
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("插入======");
        this.setFieldValByName("create_time",new Date(),metaObject);
        this.setFieldValByName("update_time",new Date(),metaObject);
    }
     //更新的时间自动填充
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("更新时间=======");
        this.setFieldValByName("update_time",new Date(),metaObject);
    }
}
