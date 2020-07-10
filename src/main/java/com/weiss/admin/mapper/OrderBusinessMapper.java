package com.weiss.admin.mapper;

import com.weiss.admin.pojo.OrderBusiness;

public interface OrderBusinessMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderBusiness record);

    int insertSelective(OrderBusiness record);

    OrderBusiness selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderBusiness record);

    int updateByPrimaryKeyWithBLOBs(OrderBusiness record);

    int updateByPrimaryKey(OrderBusiness record);
}