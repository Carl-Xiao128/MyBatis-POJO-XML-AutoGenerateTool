package com.weiss.admin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderBusiness {
    private Long id;

    private String orderNum;

    private Integer orderType;

    private String wmpid;

    private BigDecimal orderMoney;

    private BigDecimal orderIncome;

    private String wxmpName;

    private String wxmpNum;

    private String buyUserName;

    private String saleUserName;

    private Long saleManId;

    private Long amdId;

    private BigDecimal saleIncome;

    private BigDecimal amdIncome;

    private Integer transactionType;

    private Integer payType;

    private Integer orderStatus;

    private Date updateTime;

    private Date insertTime;

    private Integer isDeleted;

    private Long insertUserId;

    private Integer examineStatus;

    private Integer finalExamineStatus;

    private String orderRemark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getWmpid() {
        return wmpid;
    }

    public void setWmpid(String wmpid) {
        this.wmpid = wmpid == null ? null : wmpid.trim();
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public BigDecimal getOrderIncome() {
        return orderIncome;
    }

    public void setOrderIncome(BigDecimal orderIncome) {
        this.orderIncome = orderIncome;
    }

    public String getWxmpName() {
        return wxmpName;
    }

    public void setWxmpName(String wxmpName) {
        this.wxmpName = wxmpName == null ? null : wxmpName.trim();
    }

    public String getWxmpNum() {
        return wxmpNum;
    }

    public void setWxmpNum(String wxmpNum) {
        this.wxmpNum = wxmpNum == null ? null : wxmpNum.trim();
    }

    public String getBuyUserName() {
        return buyUserName;
    }

    public void setBuyUserName(String buyUserName) {
        this.buyUserName = buyUserName == null ? null : buyUserName.trim();
    }

    public String getSaleUserName() {
        return saleUserName;
    }

    public void setSaleUserName(String saleUserName) {
        this.saleUserName = saleUserName == null ? null : saleUserName.trim();
    }

    public Long getSaleManId() {
        return saleManId;
    }

    public void setSaleManId(Long saleManId) {
        this.saleManId = saleManId;
    }

    public Long getAmdId() {
        return amdId;
    }

    public void setAmdId(Long amdId) {
        this.amdId = amdId;
    }

    public BigDecimal getSaleIncome() {
        return saleIncome;
    }

    public void setSaleIncome(BigDecimal saleIncome) {
        this.saleIncome = saleIncome;
    }

    public BigDecimal getAmdIncome() {
        return amdIncome;
    }

    public void setAmdIncome(BigDecimal amdIncome) {
        this.amdIncome = amdIncome;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(Long insertUserId) {
        this.insertUserId = insertUserId;
    }

    public Integer getExamineStatus() {
        return examineStatus;
    }

    public void setExamineStatus(Integer examineStatus) {
        this.examineStatus = examineStatus;
    }

    public Integer getFinalExamineStatus() {
        return finalExamineStatus;
    }

    public void setFinalExamineStatus(Integer finalExamineStatus) {
        this.finalExamineStatus = finalExamineStatus;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }
}