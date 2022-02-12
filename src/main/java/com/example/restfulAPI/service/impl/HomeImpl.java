package com.example.restfulAPI.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restfulAPI.model.Advertise;
import com.example.restfulAPI.model.Products;
import com.example.restfulAPI.repository.AdvertisesDao;
import com.example.restfulAPI.repository.ProductsDao;
import com.example.restfulAPI.service.HomeService;


@Service("HomeService")
public class HomeImpl implements HomeService {
	
	@Autowired
	private AdvertisesDao advertisesDao;
	
	@Autowired
	private ProductsDao productsDao;

	
	//getAdvertises
	public List<Advertise> getAdvertises() {
		List<Advertise> optionalAdvertises = (List<Advertise>) advertisesDao.findAll();	
		return optionalAdvertises;
	}
	
	//getProducts
	public List<Products> getProducts() {
		List<Products> optionalProducts = (List<Products>) productsDao.findAll();
		return optionalProducts;
	}


	public Advertise getAdvertise(int advertiseId) {
		Optional<Advertise> optionalAdvertise = advertisesDao.findById(advertiseId); //hardcode need to fix
		if(optionalAdvertise == null) {
			//need to return something if it return null
		}
		Advertise advertisesData = optionalAdvertise.get();
		Advertise advertises = new Advertise();
		advertises.setAdvertiseid(advertisesData.getAdvertiseid());
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
		products.setProductid(productsData.getProductid());
		products.setName(productsData.getName());
		return products;
	}
}
	
