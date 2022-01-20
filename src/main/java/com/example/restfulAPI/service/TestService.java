package com.example.restfulAPI.service;

import java.util.List;

import com.example.restfulAPI.model.Advertise;
import com.example.restfulAPI.model.Products;



//@Service
public interface TestService {
	
	public List<Advertise> getAdvertises();

	public List<Products> getProducts();
	
	public Advertise getAdvertise(int advertiseId);
	
	public Products getProduct(int prodcutId);
	
}
