package com.lyd.channel.pojo;

import java.util.Date;

public class Remark {
    private Integer id;

    private Integer reguserId;

    private Integer remarkuserId;

    private String content;

    private Date insertTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReguserId() {
        return reguserId;
    }

    public void setReguserId(Integer reguserId) {
        this.reguserId = reguserId;
    }

    public Integer getRemarkuserId() {
        return remarkuserId;
    }

    public void setRemarkuserId(Integer remarkuserId) {
        this.remarkuserId = remarkuserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}