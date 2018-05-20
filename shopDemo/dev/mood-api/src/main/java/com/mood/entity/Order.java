package com.mood.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "shop_order")
public class Order {

	@Id
	Integer orderId;
	String goodName;
	BigDecimal goodPrice;
	String goodMainUrl;
	Integer goodNum;

}
