package com.duoyouhui.data.portal.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.duoyouhui.framework.basic.utils.CurrentUserUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

/**
 * MybatisPlusConfig
 *
 * @author bance
 * @date 2024/11/22
 **/
@Slf4j
@Configuration
public class MybatisPlusConfig implements MetaObjectHandler {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {

        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());

        return interceptor;
    }

    @Override
    public void insertFill(MetaObject metaObject) {
        log.debug("start insert fill ....");
        Long userId = CurrentUserUtils.getCurrentUserWithoutThrow().getUserId() == null ? 0L : CurrentUserUtils.getCurrentUser().getUserId(); ;
        LocalDateTime operTime = LocalDateTime.now();
        this.setFieldValByName("createTime", operTime,metaObject);
        this.setFieldValByName("creatorId", userId,metaObject);
        this.setFieldValByName("updaterId",userId,metaObject);
        this.setFieldValByName("updateTime",operTime,metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.debug("start update fill ....");
        Long userId = CurrentUserUtils.getCurrentUserWithoutThrow().getUserId() == null ? 0L : CurrentUserUtils.getCurrentUser().getUserId(); ;
        this.strictUpdateFill(metaObject, "updaterId",  Long.class, userId);
        this.setFieldValByName("updateTime",LocalDateTime.now(),metaObject);

    }
}
