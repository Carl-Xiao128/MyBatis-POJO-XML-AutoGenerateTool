package com.weiss.admin.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class UseOrder {
    private Integer id;

    private String odid;

    private Integer wxmpId;

    private Integer buyUid;

    private Integer status;

    private BigDecimal money;

    private Date insertTime;

    private BigDecimal handMoney;

    private BigDecimal saleHandMoney;

    private BigDecimal saleMoney;

    private Integer isDeposit;

    private BigDecimal deposit;

    private Date depositTime;

    private Integer depositDay;

    private Date payTime;

    private Date updateTime;

    private Date dealTime;

    private Boolean isDel;

    private String saleName;

    private String salePhone;

    private String saleWeixin;

    private String saleQq;

    private String buyName;

    private String buyPhone;

    private String buyWeixin;

    private String buyQq;

    private Integer dealId;

    private BigDecimal saleDeposit;

    private Integer saleDepositStatus;

    private BigDecimal saleCommission;

    private BigDecimal buyCommission;

    private Integer defaultStatus;

    private BigDecimal penaltyMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOdid() {
        return odid;
    }

    public void setOdid(String odid) {
        this.odid = odid == null ? null : odid.trim();
    }

    public Integer getWxmpId() {
        return wxmpId;
    }

    public void setWxmpId(Integer wxmpId) {
        this.wxmpId = wxmpId;
    }

    public Integer getBuyUid() {
        return buyUid;
    }

    public void setBuyUid(Integer buyUid) {
        this.buyUid = buyUid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public BigDecimal getHandMoney() {
        return handMoney;
    }

    public void setHandMoney(BigDecimal handMoney) {
        this.handMoney = handMoney;
    }

    public BigDecimal getSaleHandMoney() {
        return saleHandMoney;
    }

    public void setSaleHandMoney(BigDecimal saleHandMoney) {
        this.saleHandMoney = saleHandMoney;
    }

    public BigDecimal getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(BigDecimal saleMoney) {
        this.saleMoney = saleMoney;
    }

    public Integer getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(Integer isDeposit) {
        this.isDeposit = isDeposit;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public Date getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(Date depositTime) {
        this.depositTime = depositTime;
    }

    public Integer getDepositDay() {
        return depositDay;
    }

    public void setDepositDay(Integer depositDay) {
        this.depositDay = depositDay;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public String getSalePhone() {
        return salePhone;
    }

    public void setSalePhone(String salePhone) {
        this.salePhone = salePhone == null ? null : salePhone.trim();
    }

    public String getSaleWeixin() {
        return saleWeixin;
    }

    public void setSaleWeixin(String saleWeixin) {
        this.saleWeixin = saleWeixin == null ? null : saleWeixin.trim();
    }

    public String getSaleQq() {
        return saleQq;
    }

    public void setSaleQq(String saleQq) {
        this.saleQq = saleQq == null ? null : saleQq.trim();
    }

    public String getBuyName() {
        return buyName;
    }

    public void setBuyName(String buyName) {
        this.buyName = buyName == null ? null : buyName.trim();
    }

    public String getBuyPhone() {
        return buyPhone;
    }

    public void setBuyPhone(String buyPhone) {
        this.buyPhone = buyPhone == null ? null : buyPhone.trim();
    }

    public String getBuyWeixin() {
        return buyWeixin;
    }

    public void setBuyWeixin(String buyWeixin) {
        this.buyWeixin = buyWeixin == null ? null : buyWeixin.trim();
    }

    public String getBuyQq() {
        return buyQq;
    }

    public void setBuyQq(String buyQq) {
        this.buyQq = buyQq == null ? null : buyQq.trim();
    }

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public BigDecimal getSaleDeposit() {
        return saleDeposit;
    }

    public void setSaleDeposit(BigDecimal saleDeposit) {
        this.saleDeposit = saleDeposit;
    }

    public Integer getSaleDepositStatus() {
        return saleDepositStatus;
    }

    public void setSaleDepositStatus(Integer saleDepositStatus) {
        this.saleDepositStatus = saleDepositStatus;
    }

    public BigDecimal getSaleCommission() {
        return saleCommission;
    }

    public void setSaleCommission(BigDecimal saleCommission) {
        this.saleCommission = saleCommission;
    }

    public BigDecimal getBuyCommission() {
        return buyCommission;
    }

    public void setBuyCommission(BigDecimal buyCommission) {
        this.buyCommission = buyCommission;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public BigDecimal getPenaltyMoney() {
        return penaltyMoney;
    }

    public void setPenaltyMoney(BigDecimal penaltyMoney) {
        this.penaltyMoney = penaltyMoney;
    }
}