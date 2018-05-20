package com.mood.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "human")
public class Human {
	@Id
	Integer id;
	String gender;
	String name;
	Integer age;


}
