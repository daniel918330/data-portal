package com.duoyouhui.data.portal.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.duoyouhui.data.portal.api.dto.MetricsMonthReq;
import com.duoyouhui.data.portal.api.dto.UserCommonPageDTO;
import com.duoyouhui.data.portal.api.vo.PlatformMetricsMonthVo;
import com.duoyouhui.data.portal.service.model.AdsProfitPUserCurrencyRecord;
import com.duoyouhui.data.portal.service.model.DwsPlatformMetricsMonth;
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
     */
    @GetMapping("/api/metrics/month")
    public RespVo<PlatformMetricsMonthVo> getPlatformMetricsMonth(MetricsMonthReq dto
    ) {

        // 查询数据
        PlatformMetricsMonthVo result = dwsPlatformMetricsMonthService.getPlatformMetricsMonth(dto);

        // 如果没有查询到数据，返回失败响应
        if (result == null) {
            return RespVo.error("未找到相关数据");
        }
        // 查询到数据，返回成功响应
        return RespVo.success(result);
    }

    /**
     * 根据请求参数抵扣券信息
     */
    @GetMapping("/api/user/currency")
    public RespVo<IPage<AdsProfitPUserCurrencyRecord>> getUserCurrencyRecords(UserCommonPageDTO dto
    ) {
        // 调用服务层方法获取分页数据
        IPage<AdsProfitPUserCurrencyRecord> result = adsProfitPUserCurrencyRecordService.getUserCurrencyRecords(dto);

        // 返回分页数据，封装成 RespVo 返回
        return RespVo.success(result);
    }
}
