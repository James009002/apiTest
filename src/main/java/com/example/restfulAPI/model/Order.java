package com.example.restfulAPI.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="`order`")
public class Order {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderid;
	
	private String name;
	
	private String status;
	
	private Timestamp createtime;

	private Timestamp modifytime;
}
