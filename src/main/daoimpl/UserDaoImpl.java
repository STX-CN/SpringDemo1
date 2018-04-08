package com.smc.daoimpl;

import com.smc.dao.UserDao;

public class UserDaoImpl implements UserDao{
	@Override
	public void sayHello() {
		System.out.print("Hello World");
	}
}
