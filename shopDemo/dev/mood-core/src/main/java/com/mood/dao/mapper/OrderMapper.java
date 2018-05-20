package com.mood.dao.mapper;

import com.mood.entity.Order;
import tk.mybatis.mapper.common.Mapper;

public interface OrderMapper extends Mapper<Order> {

	public void deleteAll();

}
