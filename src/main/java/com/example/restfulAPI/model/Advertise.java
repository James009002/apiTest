package com.example.restfulAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;



@Data
@Entity(name="Advertise")
public class Advertise {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int advertiseid;
	
	private Long image;
	
	private String name;
	
	
	


	
}
