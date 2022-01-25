package com.example.restfulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfulAPI.model.Member;
import com.example.restfulAPI.service.MemberService;

@RestController
@RequestMapping("member")
@CrossOrigin(origins = "http://localhost:3000")
public class MemberController {

	@Autowired 
	MemberService memberService;
	
	//registe member
	@GetMapping("/register")
	public String registerMember() {
		
		Member member = new Member();	//hardcode 
		member.setName("jessica");
		member.setMonth(13);
		member.setDay(11);
		member.setEmail("test@gmail.com");
		member.setPassword("123123");	//need encryption
		member.setMemberid(1999);
		
		
		return memberService.register(member);
	}
	//modify member
	@RequestMapping("modify/{memberid}")
	public String modifyMember(
//			@PathVariable int memberid
			) {
		
		int memberid = 5;
		Member member = new Member();	//hardcode 
		member.setName("harry");
		member.setDay(5);
		member.setMonth(5);
		member.setPassword("123123");	//need encryption
		member.setEmail("test@gmail.com");
		member.setMemberid(memberid);
		
		return memberService.modify(member,memberid);
	}
	
	
}
