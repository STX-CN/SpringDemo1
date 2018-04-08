package com.smc.dao.impl;

import com.smc.dao.UserDao;

public class UserDaoImpl implements UserDao{
	private String message;
	
	public void sayHello() {
		System.out.print("Hello World");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void display() {
		System.out.println(getMessage());
	}

}
