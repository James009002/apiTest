package com.example.restfulAPI.service;


import org.springframework.http.ResponseEntity;



public interface OrderService {
	
	public ResponseEntity<String> query(int orderid);

	public ResponseEntity<String> modify(int orderid);
	
	public ResponseEntity<String> cancel(int orderid);

	public ResponseEntity<String> place(int orderid);
}
