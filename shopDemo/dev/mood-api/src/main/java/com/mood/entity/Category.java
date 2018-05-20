package com.mood.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "category")
public class Category {
	@Id
	Integer catId;
	String catName;
	String catType;
	String catBanner;



}
