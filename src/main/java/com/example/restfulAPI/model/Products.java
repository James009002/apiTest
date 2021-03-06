package com.example.restfulAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

import lombok.Data;


@Entity
@Data
public class Products {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productid;
	
	private String name;
	
	private Long image;
	
	private int recommend;
	
	
}
