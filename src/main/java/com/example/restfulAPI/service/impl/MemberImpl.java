package com.example.restfulAPI.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restfulAPI.model.Member;
import com.example.restfulAPI.repository.MemberDao;
import com.example.restfulAPI.service.MemberService;

@Service("MemberService")
public class MemberImpl implements MemberService{

	@Autowired
	MemberDao memberDao;
	
	@Override
	public String register(Member member) {
		try {
			System.out.println("12313@@@@@");
			boolean memberExist = memberDao.findById(member.getMemberid()) == null ? true :false;
			System.out.println(memberDao.findById(3).get()+" 嗨");
			Member test = memberDao.findByEmail(member.getEmail());
			
			//insert member detail
			memberDao.save(member);

			
			
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println("12313");
			
		}

		return "success!";
	}

	@Override
	public String modify(Member member, int memberid) {
		memberDao.findById(memberid);
		memberDao.save(member);
		return "success";
	}

}
