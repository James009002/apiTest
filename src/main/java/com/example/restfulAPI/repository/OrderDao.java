package com.example.restfulAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restfulAPI.model.Order;

@Repository
public interface OrderDao extends  CrudRepository<Order, Integer> {

}
