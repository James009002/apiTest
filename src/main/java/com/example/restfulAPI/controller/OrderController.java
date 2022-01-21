package com.example.restfulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfulAPI.model.Order;
import com.example.restfulAPI.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	
	@Autowired 
	OrderService orderService;
	
	@GetMapping("/query/{orderid}")
	public Order query(@PathVariable int orderid) {

		
		
		return orderService.query(orderid);
	}
	
	
	@RequestMapping("modify/{orderid}")
	public String modify(
//			
			) {

		return orderService.modify();
	}
	
	
	@RequestMapping("cancel/{orderid}")
	public String cancel(
//			
			) {

	
		
		return orderService.cancel();
	}
	
	@RequestMapping("place/{orderid}")
	public String place() {

		
		return orderService.place();
	}
	
	
}
