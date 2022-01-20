package com.example.restfulAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="`member`")
public class Member {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "memberid")
	private int memberid;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "month")
	private int month; 
	
	@Column(name = "day")
	private int day;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;


}
