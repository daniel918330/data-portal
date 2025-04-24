package com.duoyouhui.data.portal.service.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 指标表-月份
 * </p>
 *
 * @author byx
 * @since 2025-04-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DwsPlatformMetricsMonth implements Serializable {

    private static final long serialVersionUID = 1L;

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
