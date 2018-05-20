package com.mood.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "cart")
public class Cart {

	@Id
	Integer cartId;
	Integer goodId;
	String goodName;
	BigDecimal goodPrice;
	String goodMainUrl;
	String goodDetailUrls;
	Integer selected;
	Integer num;


	
}
