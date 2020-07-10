package com.lyd.channel.dao;

import com.lyd.channel.pojo.Assignguest;

public interface AssignguestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Assignguest record);

    int insertSelective(Assignguest record);

    Assignguest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Assignguest record);

    int updateByPrimaryKey(Assignguest record);
}