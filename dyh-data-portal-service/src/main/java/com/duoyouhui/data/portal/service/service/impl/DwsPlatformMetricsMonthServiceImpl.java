package com.duoyouhui.data.portal.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duoyouhui.data.portal.api.dto.MetricsMonthReq;
import com.duoyouhui.data.portal.api.vo.PlatformMetricsMonthVo;
import com.duoyouhui.data.portal.service.mapper.DwsPlatformMetricsMonthMapper;
import com.duoyouhui.data.portal.service.model.DwsPlatformMetricsMonth;
import com.duoyouhui.data.portal.service.service.DwsPlatformMetricsMonthService;
import com.duoyouhui.framework.basic.utils.CopyUtil;
import com.duoyouhui.framework.common.util.ComTool;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 指标表-月份 服务实现类
 * </p>
 *
 * @author byx
 * @since 2025-04-24
 */
@Service
public class DwsPlatformMetricsMonthServiceImpl extends ServiceImpl<DwsPlatformMetricsMonthMapper, DwsPlatformMetricsMonth> implements DwsPlatformMetricsMonthService {

    @Override
    public PlatformMetricsMonthVo getPlatformMetricsMonth(MetricsMonthReq param) {
        return lambdaQuery().eq(ComTool.isNotBlank(param.getMetricMonth()), DwsPlatformMetricsMonth::getMetricMonth, param.getMetricMonth())
                .eq(ComTool.isNotBlank(param.getMetricType()), DwsPlatformMetricsMonth::getMetricType, param.getMetricType())
                .eq(ComTool.isNotBlank(param.getMetricName()), DwsPlatformMetricsMonth::getMetricName, param.getMetricName())
                .oneOpt()
                .map(x -> CopyUtil.copyBean(x, PlatformMetricsMonthVo::new))
                .orElse(null);
    }
}
