package com.example.restfulAPI.service;

import com.example.restfulAPI.model.Member;

public interface OrderService {
	
	public String query();

	public String modify();
	
	public String cancel();

	public String place();
}
