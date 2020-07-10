package com.lyd.channel.dao;

import com.lyd.channel.pojo.Remark;

public interface RemarkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Remark record);

    int insertSelective(Remark record);

    Remark selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Remark record);

    int updateByPrimaryKey(Remark record);
}