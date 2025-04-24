package com.duoyouhui.data.portal.api.dto;

import lombok.Data;

/**
 * Copyright © 2024 DYH Info. Tech Ltd. All rights reserved.
 * <p></p>
 *
 * @author byx
 * @version 1.0.0
 * @date 2025/4/24
 */
@Data
public class MetricsMonthReq {

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

}
