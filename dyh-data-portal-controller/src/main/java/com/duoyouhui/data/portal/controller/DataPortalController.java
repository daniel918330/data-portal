package com.duoyouhui.data.portal.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.duoyouhui.data.portal.api.dto.MetricsMonthReq;
import com.duoyouhui.data.portal.api.vo.PlatformMetricsMonthVo;
import com.duoyouhui.data.portal.service.model.AdsProfitPUserCurrencyRecord;
import com.duoyouhui.data.portal.service.service.AdsProfitPUserCurrencyRecordService;
import com.duoyouhui.data.portal.service.service.DwsPlatformMetricsMonthService;
import com.duoyouhui.framework.common.vo.RespVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    private final AdsProfitPUserCurrencyRecordService adsProfitPUserCurrencyRecordService;

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

    /**
     * 根据请求参数抵扣券信息
     */
    @GetMapping("/api/user/currency")
    public RespVo<IPage<AdsProfitPUserCurrencyRecord>> getUserCurrencyRecords(
            @RequestParam(name = "userId", required = false) Long userId,
            @RequestParam(name = "startDate", required = false) String startDate,
            @RequestParam(name = "endDate", required = false) String endDate,
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "10") int size
    ) {
        // 调用服务层方法获取分页数据
        IPage<AdsProfitPUserCurrencyRecord> pageResult = adsProfitPUserCurrencyRecordService.getUserCurrencyRecords(userId, startDate, endDate, page, size);

        // 返回分页数据，封装成 RespVo 返回
        return RespVo.success(pageResult);
    }
}
