package com.example.restfulAPI.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;



@Data
@Entity(name="Advertise")
public class Advertises {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Long image;
	
	private String name;

	


	
}
