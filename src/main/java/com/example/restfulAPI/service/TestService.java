package com.example.restfulAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restfulAPI.service.impl.TestImpl;


public interface TestService {
	
	
	public String getUserDetail();

	public String getProductDetail();
	
	
}
