package com.example.restfulAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="`order`")
public class Order {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int orderid;
	
	private String name;
	
	private String status;
}
