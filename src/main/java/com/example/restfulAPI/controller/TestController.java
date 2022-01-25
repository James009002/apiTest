package com.example.restfulAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfulAPI.model.Advertise;
import com.example.restfulAPI.model.Products;
import com.example.restfulAPI.service.TestService;

@RestController
public class TestController {
	
	@Autowired 
	TestService testService; 
	
	//getAdvertises
	@GetMapping("advertises")
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Advertise> getAdvertises() {
		return testService.getAdvertises();
	}
	//getProducts
	@GetMapping("products")
	public List<Products> getProducts() {
		return testService.getProducts();
	}
	
	
	//getAdvertise
	@GetMapping("advertise/{advertiseId}")
	public Advertise getAdvertise(@PathVariable int advertiseId) {
		return testService.getAdvertise(advertiseId);
	}
	
	//getAdvertise
	@GetMapping("product/{productId}")
	public Products getProduct(@PathVariable int productId) {
		return testService.getProduct(productId);
	}
	
	
}
