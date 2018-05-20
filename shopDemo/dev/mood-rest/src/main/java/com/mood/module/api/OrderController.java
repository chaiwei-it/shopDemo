package com.mood.module.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mood.dao.mapper.OrderMapper;
import com.mood.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderMapper orderMapper;
	
	@RequestMapping(value="/get_all",produces = "application/json; charset=utf-8",method= {RequestMethod.GET})
	@ResponseBody
	public Object getAll() throws IOException {
		List<Order> results= orderMapper.selectAll();
		ObjectMapper mapper=new ObjectMapper();
		String ret=mapper.writeValueAsString(results);
		System.out.println("/order/get_all:ORDER:"+ret);
		return ret;
	}
	
	/*@RequestMapping(value = "/add", produces = "application/json; charset=utf-8", method = {RequestMethod.GET })
	@ResponseBody//警告: No mapping found for HTTP request with URI [/yMybatis/WEB-INF/jsp/cart/add.jsp] in DispatcherServlet with name 'springmvc'
	//这个警告无关紧要: No mapping found for HTTP request with URI [/yMybatis/] in DispatcherServlet with name 'springmvc'
	public void add(HttpServletRequest req) throws IOException {
		Integer goodId=Integer.valueOf(req.getParameter("goodId"));
		BigDecimal goodPrice=new BigDecimal(req.getParameter("goodPrice"));
		Cart cart=new Cart(goodId,req.getParameter("goodName"),goodPrice, req.getParameter("goodMainUrl"),req.getParameter("goodDetailUrls"));
		orderMapper.insert(cart);
	}*/
}
