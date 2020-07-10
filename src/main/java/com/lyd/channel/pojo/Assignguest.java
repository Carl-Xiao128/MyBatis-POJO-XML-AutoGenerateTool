package com.lyd.channel.pojo;

import java.util.Date;

public class Assignguest {
    private Integer id;

    private Integer reguserId;

    private Integer assignuserId;

    private Integer guestuserId;

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

    public Integer getAssignuserId() {
        return assignuserId;
    }

    public void setAssignuserId(Integer assignuserId) {
        this.assignuserId = assignuserId;
    }

    public Integer getGuestuserId() {
        return guestuserId;
    }

    public void setGuestuserId(Integer guestuserId) {
        this.guestuserId = guestuserId;
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