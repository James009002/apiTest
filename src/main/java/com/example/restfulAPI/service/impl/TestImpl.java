package com.example.restfulAPI.service.impl;

import org.springframework.stereotype.Service;

import com.example.restfulAPI.service.TestService;

@Service("TestService")
public class TestImpl implements TestService {

	public String getUserDetail() {	
		return "姓名:張哲瑋;年齡:31;公司:科熱台灣有限公司";
	}
	
	public String getProductDetail() {	
		return "雞胸肉";
	}
}
