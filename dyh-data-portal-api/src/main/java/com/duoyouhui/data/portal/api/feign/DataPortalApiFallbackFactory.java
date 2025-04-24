package com.duoyouhui.data.portal.api.feign;

import com.duoyouhui.data.portal.api.dto.MetricsMonthReq;
import com.duoyouhui.data.portal.api.vo.PlatformMetricsMonthVo;
import com.duoyouhui.framework.common.constant.SystemConstants;
import com.duoyouhui.framework.common.exception.NetworkException;
import com.duoyouhui.framework.common.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * DataPortalApiFallbackFactory
 *
 * @author byx
 * @date 2025/04/23
 **/
@Slf4j
@Component
public class DataPortalApiFallbackFactory implements FallbackFactory<DataPortalApi> {

    @Override
    public DataPortalApi create(Throwable cause) {
        return new DataPortalApi() {

            @Override
            public RespVo<PlatformMetricsMonthVo> getPlatformMetricsMonth(MetricsMonthReq metricsMonthReq) {
                log.error(SystemConstants.NETWORK_ERROR_MESSAGE + cause.getMessage(), cause);
                throw new NetworkException(SystemConstants.NETWORK_ERROR, SystemConstants.NETWORK_ERROR_MESSAGE);
            }
        };
    }
}
