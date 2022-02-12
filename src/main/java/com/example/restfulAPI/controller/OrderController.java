package com.example.restfulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfulAPI.service.OrderService;


@RestController
@RequestMapping("order")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

	
	@Autowired 
	OrderService orderService;
	
	@GetMapping("/query/{orderid}")
	public ResponseEntity<String> query(@PathVariable int orderid) {
		 
		
		ResponseEntity<String> response = orderService.query(orderid);
		return response;
	}
	
	
	@RequestMapping("modify/{orderid}")
	public ResponseEntity<String> modify(
			@PathVariable int orderid
		) {
			ResponseEntity<String> response = orderService.modify(orderid);
		return response;
	}
	
	
	@RequestMapping("cancel/{orderid}")
	public ResponseEntity<String> cancel(
			@PathVariable int orderid
			) {
		ResponseEntity<String> response = null;
		try {
			response = orderService.cancel(orderid);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	@RequestMapping("place/{orderid}")
	public ResponseEntity<String> place(
			@PathVariable int orderid
		) {
		ResponseEntity<String> response = null;
		response = orderService.place(orderid);
		
		return response;
	}
	
	
}
