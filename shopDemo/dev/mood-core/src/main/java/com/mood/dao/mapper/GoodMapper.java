package com.mood.dao.mapper;

import com.mood.entity.Good;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface GoodMapper extends Mapper<Good> {

	public List<Good> getAllOdd();

	public List<Good> getAllEven();

	public List<Good> getByType(String goodType);

	//首页滑窗商品
	public List<Good> getTitle();

}
