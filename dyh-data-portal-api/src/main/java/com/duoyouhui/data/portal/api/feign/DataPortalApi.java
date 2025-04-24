package com.duoyouhui.data.portal.api.feign;

import com.duoyouhui.data.portal.api.dto.MetricsMonthReq;
import com.duoyouhui.data.portal.api.vo.PlatformMetricsMonthVo;
import com.duoyouhui.framework.common.vo.RespVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * DataPortalApi
 *
 * @author byx
 * @date 2025/04/23
 **/

@FeignClient(name = "dyh-data-portal", contextId = "DataPortalApi",url = "${svc.data.portal.url:}", fallbackFactory = DataPortalApiFallbackFactory.class)
public interface DataPortalApi {

    /**
     * 根据月份、指标名称查询指标值
     * @param metricsMonthReq -
     * @return -
     */
    @PostMapping(value = "/internal/dp/metrics/month")
    RespVo<PlatformMetricsMonthVo> getPlatformMetricsMonth(@RequestBody @Validated MetricsMonthReq metricsMonthReq);



}
