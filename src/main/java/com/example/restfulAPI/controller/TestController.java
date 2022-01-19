package com.example.restfulAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfulAPI.model.Advertises;
import com.example.restfulAPI.model.Products;
import com.example.restfulAPI.service.TestService;

@RestController
public class TestController {
	
	@Autowired 
	TestService testService; 
	
	//getAdvertises
	@GetMapping("getAdvertises")
	public List<Advertises> getAdvertises() {
		return testService.getAdvertises();
	}
	//getProducts
	@GetMapping("getProducts")
	public List<Products> getProducts() {
		return testService.getProducts();
	}
	
	
	//getAdvertise
	@GetMapping("getAdvertise/{advertiseId}")
	public Advertises getAdvertise(@PathVariable int advertiseId) {
		return testService.getAdvertise(advertiseId);
	}
	
	//getAdvertise
	@GetMapping("getProduct/{productId}")
	public Products getProduct(@PathVariable int productId) {
		return testService.getProduct(productId);
	}
	
	
}
