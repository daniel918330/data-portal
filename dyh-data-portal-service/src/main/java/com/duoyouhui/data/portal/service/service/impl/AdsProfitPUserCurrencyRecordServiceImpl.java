package com.duoyouhui.data.portal.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duoyouhui.data.portal.api.dto.UserCommonPageDTO;
import com.duoyouhui.data.portal.service.model.AdsProfitPUserCurrencyRecord;
import com.duoyouhui.data.portal.service.service.AdsProfitPUserCurrencyRecordService;
import com.duoyouhui.data.portal.service.mapper.AdsProfitPUserCurrencyRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author caozhongwei
* @description 针对表【ads_profit_p_user_currency_record(用户券明细明细)】的数据库操作Service实现
* @createDate 2025-05-12 12:04:33
*/
@Service
public class AdsProfitPUserCurrencyRecordServiceImpl extends ServiceImpl<AdsProfitPUserCurrencyRecordMapper, AdsProfitPUserCurrencyRecord>
    implements AdsProfitPUserCurrencyRecordService{

    @Override
    public IPage<AdsProfitPUserCurrencyRecord> getUserCurrencyRecords(UserCommonPageDTO dto) {
        // 创建分页对象
        Page<AdsProfitPUserCurrencyRecord> pageRequest = new Page<>(dto.getPage(),dto.getSize());

        // 构造查询条件
        LambdaQueryWrapper<AdsProfitPUserCurrencyRecord> queryWrapper = Wrappers.lambdaQuery(AdsProfitPUserCurrencyRecord.class);

        // 如果提供了时间范围条件（startDate 或 endDate），则加上时间范围查询条件
        if (dto.getApplyEndTime() != null && dto.getApplyEndTime() != null) {
            System.out.println("startDate: " + dto.getApplyEndTime() + ", endDate: " + dto.getApplyEndTime());
            queryWrapper.between(AdsProfitPUserCurrencyRecord::getCreateTime, dto.getApplyStartTime(),dto.getApplyEndTime()); // 小于等于 endDate
        }

        // 如果提供了 assetType，则加上 assetType 的查询条件
        if (dto.getAssetType() != null && !dto.getAssetType().isEmpty()) {
            System.out.println("Querying by AssetType: " + dto.getAssetType());
            queryWrapper.eq(AdsProfitPUserCurrencyRecord::getAssetType, dto.getAssetType());
        }

        // 如果提供了 userId，则加上 userId 的查询条件
        if (dto.getUserId() != null)  {
            System.out.println("Querying by userId: " + dto.getUserId());
            queryWrapper.eq(AdsProfitPUserCurrencyRecord::getUserId, dto.getUserId());
        }

        // 根据创建时间倒序排列
        queryWrapper.orderByDesc(AdsProfitPUserCurrencyRecord::getCreateTime);

        // 打印sql
        System.out.println("QueryWrapper: " + queryWrapper.getTargetSql());

        // 执行分页查询
        return this.page(pageRequest, queryWrapper);

    }


}




