package com.duoyouhui.data.portal.service.service;

import com.duoyouhui.data.portal.api.dto.MetricsMonthReq;
import com.duoyouhui.data.portal.api.vo.PlatformMetricsMonthVo;
import com.duoyouhui.data.portal.service.model.DwsPlatformMetricsMonth;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 指标表-月份 服务类
 * </p>
 *
 * @author byx
 * @since 2025-04-24
 */
public interface DwsPlatformMetricsMonthService extends IService<DwsPlatformMetricsMonth> {

    /**
     * 查询指标信息
     * @param metricsMonthReq -
     * @return -
     */
    PlatformMetricsMonthVo getPlatformMetricsMonth(MetricsMonthReq metricsMonthReq);
}
