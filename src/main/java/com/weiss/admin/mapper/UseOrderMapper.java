package com.weiss.admin.mapper;

import com.weiss.admin.pojo.UseOrder;

public interface UseOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseOrder record);

    int insertSelective(UseOrder record);

    UseOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseOrder record);

    int updateByPrimaryKey(UseOrder record);
}