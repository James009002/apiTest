package com.example.restfulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfulAPI.service.TestService;

@RestController
public class TestController {
	
	@Autowired 
	TestService testService; 
	
	@GetMapping("getUserDetail")
	public String userDetail() {
		return testService.getUserDetail();
	}
	
	@GetMapping("getProductDetail")
	public String productDetail() {
		return testService.getProductDetail();
	}
}
