package com.example.restfulAPI.service.impl;

import java.sql.Timestamp;
import java.util.Optional;

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
		Order result = null;
		Optional<Order> orderResponse = orderDao.findById(orderid);
		Order order = new Order();
		order = orderResponse.isEmpty() ? result : orderResponse.get();
		String response = gsonToJson(order);
		
		return ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<String> modify(int orderid) {

		Optional<Order> optionModifyOrder = orderDao.findById(orderid);
		Order orderModify = optionModifyOrder.get();
		orderModify.setStatus("995");
		orderModify.setName("測試");
		
		orderModify.setModifytime(currentTime());
		orderDao.save(orderModify);
		Optional<Order> orderResponse = orderDao.findById(orderid);
		
		Order order = new Order();	
		order = orderResponse.isEmpty() ? null  : orderResponse.get();
		String response = gsonToJson(order);
		return ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<String> cancel(int orderid) {
		Optional<Order> optionOrderCancel = orderDao.findById(orderid);
		Order orderModify = optionOrderCancel.get();
		orderModify.setStatus("3");
		orderModify.setModifytime(currentTime());
		
		orderDao.save(orderModify);
		Optional<Order> orderResponse = orderDao.findById(orderid);
		
		Order order = new Order();	
		order = orderResponse.isEmpty() ? null  : orderResponse.get();
		String response = gsonToJson(order);
		
		
		return ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<String> place(int orderid) {
		Order orderModify = new Order();
		orderModify.setStatus("1");
		orderModify.setModifytime(currentTime());
		orderModify.setModifytime(currentTime());
		orderModify.setName("james");
		orderDao.save(orderModify);
		Optional<Order> orderResponse = orderDao.findById(orderid);
		
		String response = gsonToJson(orderResponse);
		return ResponseEntity.ok().body(response);
	}
	
	public String gsonToJson(Object order) {
		Gson gson = new Gson();
		String responseToJSON = gson.toJson(order); 
		return responseToJSON;
	}
	
	public Timestamp currentTime() {
		Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
        return timestamp;
	}

}
