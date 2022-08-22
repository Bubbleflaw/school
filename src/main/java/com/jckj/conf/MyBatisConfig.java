package com.jckj.conf;

import com.baomidou.mybatisplus.extension.injector.methods.LogicDeleteBatchByIds;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Collections;

/**
 * @Author:黄文倩
 * @CreatTime:2022/8/18
 * @Description:分页拦截器
 */
//@MapperScan("com.yjy.springbootdemo.mapper")
@EnableTransactionManagement
@Configuration
public class MyBatisConfig {
    //分页插件
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){
         return new PaginationInnerInterceptor();
    }
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor=new MybatisPlusInterceptor();
        mybatisPlusInterceptor.setInterceptors(Collections.singletonList(paginationInnerInterceptor()));
        return mybatisPlusInterceptor;
    }
    //注入逻辑删除的器配置
    @Bean
    public LogicDeleteBatchByIds sqlInjector(){
        return new LogicDeleteBatchByIds();
    }
}
