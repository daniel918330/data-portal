package com.duoyouhui.data.portal.api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class UserCommonPageDTO {
    /**
     * 用户id
     */
//    @NotNull(message = "用户id不能为空")
    private Long userId;

    /**
     * 资产类型
     */
    private String assetType;


    /**
     * 收支类型 1：收入  2：支出
     */
    private String type;


    /**
     * 收支类型 订单号
     */
    private String batchCode;

    /**
     * 搜索开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime applyStartTime;

    /**
     * 搜索结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime applyEndTime;

    private Integer page = 1; // 当前页
    private Integer size = 10; // 每页数量

}
