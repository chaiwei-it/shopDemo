package com.mood.entity;

import lombok.Data;

/**
 * 非数据库表，作为中间过渡的订单实体类。
 * 
 * @Author doctorrm
 * @Time 2017-12-04 下午12:28:30
 */
@Data
public class OrderInfo {
	/**
	 * 字段迎合了前端发送过来的数据
	 */
	Integer cartId;
	Integer goodId;
	String goodName;
	String goodPrice;
	String goodMainUrl;
	String goodDetailUrls;
	Boolean selected;
	Integer num;



}
