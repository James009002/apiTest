package com.example.restfulAPI.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restfulAPI.model.Advertises;
import com.example.restfulAPI.model.Products;
import com.example.restfulAPI.repository.AdvertisesDao;
import com.example.restfulAPI.repository.ProductsDao;
import com.example.restfulAPI.service.TestService;


@Service("TestService")
public class TestImpl implements TestService {
	
	@Autowired
	private AdvertisesDao advertisesDao;
	
	@Autowired
	private ProductsDao productsDao;

	
	//getAdvertises
	public List<Advertises> getAdvertises() {
		List<Advertises> optionalAdvertises = (List<Advertises>) advertisesDao.findAll();	
		return optionalAdvertises;
	}
	
	//getProducts
	public List<Products> getProducts() {
		List<Products> optionalProducts = (List<Products>) productsDao.findAll();
		return optionalProducts;
	}


	public Advertises getAdvertise(int advertiseId) {
		Optional<Advertises> optionalAdvertise = advertisesDao.findById(advertiseId); //hardcode need to fix
		if(optionalAdvertise == null) {
			//need to return something if it return null
		}
		Advertises advertisesData = optionalAdvertise.get();
		Advertises advertises = new Advertises();
		advertises.setId(advertisesData.getId());
		advertises.setName(advertisesData.getName());
		return advertises;
	}


	public Products getProduct(int productId) {
		Optional<Products> optionalProducts = productsDao.findById(productId);	//hardcode need to fix
		if(optionalProducts == null) {
			//need to return something if it return null
		}
		Products productsData = optionalProducts.get();
		Products products = new Products();
		products.setId(productsData.getId());
		products.setName(productsData.getName());
		return products;
	}
}
	
