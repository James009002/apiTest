package com.example.restfulAPI.service;

import com.example.restfulAPI.model.Member;

public interface MemberService{
	
	public String register(Member member);

	public String modify(Member member,int memberid);
}
