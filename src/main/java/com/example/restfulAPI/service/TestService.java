package com.example.restfulAPI.service;

import java.util.List;

import com.example.restfulAPI.model.Advertises;
import com.example.restfulAPI.model.Products;



//@Service
public interface TestService {
	
	public List<Advertises> getAdvertises();

	public List<Products> getProducts();
	
	public Advertises getAdvertise(int advertiseId);
	
	public Products getProduct(int prodcutId);
	
}
