package com.example.restfulAPI.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.restfulAPI.model.Order;
import com.example.restfulAPI.repository.OrderDao;
import com.example.restfulAPI.service.OrderService;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;


@Service("OrderService")
public class OrderImpl implements OrderService{

	@Autowired
	OrderDao orderDao;
	
	@Override
	public Order query(int orderid) {
//		ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
//		ResponseEntity<ObjectNode> response;
		
		
		Order result = null;
		Optional<Order> orderResponse = orderDao.findById(orderid);
		Order order = new Order();
		if(orderResponse.isEmpty()) {
			order = result;
		}else {
			order = orderResponse.get();
		}
		
		return order;
	}

	@Override
	public String modify() {
		
		return null;
	}

	@Override
	public String cancel() {
		
		return null;
	}

	@Override
	public String place() {
		
		return null;
	}

}
