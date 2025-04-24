package com.duoyouhui.data.portal.api.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Copyright © 2024 DYH Info. Tech Ltd. All rights reserved.
 * <p></p>
 *
 * @author byx
 * @version 1.0.0
 * @date 2025/4/24
 */
@Data
public class PlatformMetricsMonthVo {

    /**
     * 月份
     */
    private String metricMonth;

    /**
     * 指标类型
     */
    private String metricType;

    /**
     * 指标名称
     */
    private String metricName;

    /**
     * 指标值A
     */
    private BigDecimal metricA;

    /**
     * 指标值B
     */
    private BigDecimal metricB;

    /**
     * 指标值
     */
    private BigDecimal metricValue;

    /**
     * 备注
     */
    private String remark;

    /**
     * 计算时间
     */
    private LocalDateTime etlTime;

}
