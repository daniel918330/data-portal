package com.duoyouhui.data.portal.service.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.duoyouhui.data.portal.service.model.AdsProfitPUserCurrencyRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author caozhongwei
* @description 针对表【ads_profit_p_user_currency_record(用户券明细明细)】的数据库操作Service
* @createDate 2025-05-12 12:04:33
*/
public interface AdsProfitPUserCurrencyRecordService extends IService<AdsProfitPUserCurrencyRecord> {
    IPage<AdsProfitPUserCurrencyRecord> getUserCurrencyRecords(Long userId, String startDate, String endDate , int page, int size);
}
