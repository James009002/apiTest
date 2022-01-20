package com.example.restfulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.restfulAPI.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	
	@Autowired 
	OrderService orderService;
	
	@GetMapping("/order")
	public String query() {
		
		
		
		return orderService.query();
	}
	
	
	@RequestMapping("order/{orderid}")
	public String modify(
//			
			) {

		return orderService.modify();
	}
	
	
	@RequestMapping("modify/{orderid}")
	public String cancel(
//			
			) {

	
		
		return orderService.cancel();
	}
	
	@RequestMapping("modify/{orderid}")
	public String place() {

		
		return orderService.place();
	}
	
	
}
