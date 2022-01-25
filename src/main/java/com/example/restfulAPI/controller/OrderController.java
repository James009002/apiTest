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

		
			ResponseEntity<String> response;
			response = orderService.query(orderid); 
			System.out.println("response is : " + response);
			return response;
		
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
