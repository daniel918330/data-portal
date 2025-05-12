package com.duoyouhui.data.portal.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户券明细明细
 *
 * @TableName ads_profit_p_user_currency_record
 */
@TableName(value = "ads_profit_p_user_currency_record")
public class AdsProfitPUserCurrencyRecord {
    /**
     *
     */
    private Long id;

    /**
     * 积分变动用户
     */
    private Long userId;

    /**
     *
     */
    private BigDecimal originalAmount;

    /**
     * 获得积分
     */
    private BigDecimal amount;

    /**
     * 订单编号
     */
    private String batchcode;

    /**
     * 推动加速的订单编号
     */
    private String chainBatchcode;

    /**
     * 释放期数
     */
    private Integer queueIndex;

    /**
     * 批次号，微服务调用
     */
    private String batchNumber;

    /**
     * 备注
     */
    private String remark;

    /**
     * 完成后金额
     */
    private BigDecimal currentAmount;

    /**
     * 资产类型
     */
    private String assetType;

    /**
     * 状态 1完成
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 1：收入  2：支出
     */
    private String type;

    /**
     * 收益类型,user 用户, merchant 商户
     */
    private String userType;

    /**
     *
     */
    public Long getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 积分变动用户
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 积分变动用户
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     *
     */
    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    /**
     *
     */
    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * 获得积分
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 获得积分
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 订单编号
     */
    public String getBatchcode() {
        return batchcode;
    }

    /**
     * 订单编号
     */
    public void setBatchcode(String batchcode) {
        this.batchcode = batchcode;
    }

    /**
     * 推动加速的订单编号
     */
    public String getChainBatchcode() {
        return chainBatchcode;
    }

    /**
     * 推动加速的订单编号
     */
    public void setChainBatchcode(String chainBatchcode) {
        this.chainBatchcode = chainBatchcode;
    }

    /**
     * 释放期数
     */
    public Integer getQueueIndex() {
        return queueIndex;
    }

    /**
     * 释放期数
     */
    public void setQueueIndex(Integer queueIndex) {
        this.queueIndex = queueIndex;
    }

    /**
     * 批次号，微服务调用
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * 批次号，微服务调用
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 完成后金额
     */
    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    /**
     * 完成后金额
     */
    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }

    /**
     * 资产类型
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * 资产类型
     */
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * 状态 1完成
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态 1完成
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 1：收入  2：支出
     */
    public String getType() {
        return type;
    }

    /**
     * 1：收入  2：支出
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 收益类型,user 用户, merchant 商户
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 收益类型,user 用户, merchant 商户
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }
}