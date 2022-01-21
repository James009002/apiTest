package com.example.restfulAPI.service;


import com.example.restfulAPI.model.Order;

public interface OrderService {
	
	public Order query(int orderid);

	public String modify();
	
	public String cancel();

	public String place();
}
