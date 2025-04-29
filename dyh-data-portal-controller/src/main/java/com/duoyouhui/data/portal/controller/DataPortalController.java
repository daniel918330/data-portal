package com.duoyouhui.data.portal.controller;

import com.duoyouhui.data.portal.api.dto.MetricsMonthReq;
import com.duoyouhui.data.portal.api.vo.PlatformMetricsMonthVo;
import com.duoyouhui.data.portal.service.service.DwsPlatformMetricsMonthService;
import com.duoyouhui.framework.common.vo.RespVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * DataPortalController
 * 提供查询数据接口
 *
 * @author byx
 * @date 2025/04/24
 */
@RestController
@RequiredArgsConstructor
public class DataPortalController {

    private final DwsPlatformMetricsMonthService dwsPlatformMetricsMonthService;

    /**
     * 根据请求参数查询指标信息
     * @param metricMonth 指标月份
     * @param metricType 指标类型
     * @param metricName 指标名称
     * @return 返回查询结果
     */
    @GetMapping("/api/metrics/month")
    public RespVo<PlatformMetricsMonthVo> getPlatformMetricsMonth(
            @RequestParam(name = "metricMonth", required = false) String metricMonth,
            @RequestParam(name = "metricType", required = false) String metricType,
            @RequestParam(name = "metricName", required = false) String metricName
    ) {
        // 方法体


        // 创建请求参数对象
        MetricsMonthReq metricsMonthReq = new MetricsMonthReq();
        metricsMonthReq.setMetricMonth(metricMonth);
        metricsMonthReq.setMetricType(metricType);
        metricsMonthReq.setMetricName(metricName);

        // 查询数据
        PlatformMetricsMonthVo result = dwsPlatformMetricsMonthService.getPlatformMetricsMonth(metricsMonthReq);

        // 如果没有查询到数据，返回失败响应
//        if (result == null) {
//            return RespVo.fail("未找到相关数据");
//        }
        // 查询到数据，返回成功响应
        return RespVo.success(result);
    }
}
