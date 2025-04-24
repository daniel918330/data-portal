package com.duoyouhui.data.portal.service.service.client;

import com.duoyouhui.data.portal.api.dto.MetricsMonthReq;
import com.duoyouhui.data.portal.api.feign.DataPortalApi;
import com.duoyouhui.data.portal.api.vo.PlatformMetricsMonthVo;
import com.duoyouhui.data.portal.service.service.DwsPlatformMetricsMonthService;
import com.duoyouhui.framework.common.vo.RespVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2024 DYH Info. Tech Ltd. All rights reserved.
 * <p></p>
 *
 * @author byx
 * @version 1.0.0
 * @date 2025/4/24
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class DataPortalApiImpl implements DataPortalApi {

    private final DwsPlatformMetricsMonthService dwsPlatformMetricsMonthService;

    @Override
    public RespVo<PlatformMetricsMonthVo> getPlatformMetricsMonth(MetricsMonthReq metricsMonthReq) {
        return RespVo.success(dwsPlatformMetricsMonthService.getPlatformMetricsMonth(metricsMonthReq));
    }
}
