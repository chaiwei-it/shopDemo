package com.mood.module.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mood.dao.mapper.CategoryMapper;
import com.mood.dao.mapper.GoodMapper;
import com.mood.entity.Category;
import com.mood.entity.FullCategory;
import com.mood.entity.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryMapper categoryMapper;

	@Autowired
	GoodMapper goodMapper;

	@RequestMapping(value = "/get_all", produces = "application/json; charset=utf-8", method = { RequestMethod.GET })
	@ResponseBody
	public Object getAll() throws IOException {
		List<Category> results = categoryMapper.selectAll();
		List<FullCategory> full_results=new ArrayList<FullCategory>();
		for (Category category : results) {
			List<Good> goods = goodMapper.getByType(category.getCatType());
			FullCategory fullCategory=new FullCategory();
			fullCategory.setDbCategory(category);
			fullCategory.setDbGoods(goods);
			full_results.add(fullCategory);
		}
		ObjectMapper mapper = new ObjectMapper();
		String ret = mapper.writeValueAsString(full_results);
		System.out.println(ret);
		return ret;
	}
}
