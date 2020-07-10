package com.weiss.admin.mapper;

import com.weiss.admin.pojo.OrderRemark;

public interface OrderRemarkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderRemark record);

    int insertSelective(OrderRemark record);

    OrderRemark selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderRemark record);

    int updateByPrimaryKey(OrderRemark record);
}