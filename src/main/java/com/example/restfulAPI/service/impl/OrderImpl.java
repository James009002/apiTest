package com.example.restfulAPI.service.impl;

import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.restfulAPI.model.Order;
import com.example.restfulAPI.repository.OrderDao;
import com.example.restfulAPI.service.OrderService;
import com.google.gson.Gson;


@Service("OrderService")
public class OrderImpl implements OrderService{

	@Autowired
	OrderDao orderDao;
	
	@Override
	public ResponseEntity<String> query(int orderid) {
//		ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
//		ResponseEntity<ObjectNode> response;
		
		Order result = null;
		Optional<Order> orderResponse = orderDao.findById(orderid);
		Order order = new Order();
		if(!orderResponse.isPresent()) {
			order = result;
		}else {
			order = orderResponse.get();
			System.out.println("order is : " + order);
		}
		Gson gson = new Gson();
		String responseToJSON = gson.toJson(order); 
		System.out.println("order json is : " + responseToJSON);
		return ResponseEntity.ok().body(responseToJSON);
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
