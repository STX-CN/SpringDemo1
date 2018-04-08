package com.smc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smc.dao.UserDao;
import com.smc.dao.impl.ChinesePersonDaoImpl;

public class MyTest {
	
	public static void main(String[] args)
	{
		System.out.println("1234");
		try {
			ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			UserDao dao = ac.getBean("UserDao", UserDao.class);
			dao.sayHello();
			dao.display();
			ChinesePersonDaoImpl pDao = ac.getBean("ChinesePersonDaoImpl", ChinesePersonDaoImpl.class);
			pDao.display();
			System.out.println("\n");
			pDao.displayFeature();
			System.out.println("\n");
			pDao.displayProperty();
			System.out.println("\n");
			pDao.displayMap();
			System.out.println("\n");
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
