package com.example.restfulAPI.exception;

public class BaseException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public BaseException() {

	}

	public BaseException(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
