package com.example.restfulAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restfulAPI.model.Products;

@Repository
public interface ProductsDao extends CrudRepository<Products, Integer> {

}
