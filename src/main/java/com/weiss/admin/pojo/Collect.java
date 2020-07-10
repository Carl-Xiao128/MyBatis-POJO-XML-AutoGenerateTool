package com.weiss.admin.pojo;

import java.util.Date;

public class Collect {
    private Integer id;

    private Integer userId;

    private Integer wxmpId;

    private Date insertTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWxmpId() {
        return wxmpId;
    }

    public void setWxmpId(Integer wxmpId) {
        this.wxmpId = wxmpId;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}