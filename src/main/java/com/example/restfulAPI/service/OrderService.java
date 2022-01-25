package com.example.restfulAPI.service;


import org.springframework.http.ResponseEntity;



public interface OrderService {
	
	public ResponseEntity<String> query(int orderid);

	public String modify();
	
	public String cancel();

	public String place();
}
