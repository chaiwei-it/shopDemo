package com.mood.entity;

import lombok.Data;

import java.util.List;

@Data
public class FullCategory {

	Category dbCategory;

	List<Good> dbGoods;



}
