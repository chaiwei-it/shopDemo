package com.mood.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "good")
public class Good {
	@Id
	Integer goodId;
	String goodName;
	BigDecimal goodPrice;
	String goodMainUrl;
	String goodDetailUrls;
	String goodType;

}
