package com.duoyouhui.data.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = {})
@MapperScan("com.duoyouhui.data.portal.service.mapper")
public class DyhDataPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DyhDataPortalApplication.class, args);
    }

}
