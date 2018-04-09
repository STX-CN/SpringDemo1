package com.smc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smc.dao.UserDao;
import com.smc.dao.impl.ChinesePersonDaoImpl;
import com.smc.injection.ConstructInjectionBean;
import com.smc.injection.SetterInjectionBean;
import com.smc.lookup.LookupBean;

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
			
			ConstructInjectionBean constructInject = ac.getBean("constructInjectionBean", ConstructInjectionBean.class);
			constructInject.display();
			System.out.println("\n");
			
			SetterInjectionBean setterInjectionBean = ac.getBean("setterInjectionBean", SetterInjectionBean.class);
			setterInjectionBean.display();
			
			LookupBean lookupBean = (LookupBean)ac.getBean("lookupBean", LookupBean.class);
			System.out.println("=========First Time ========");
			lookupBean.getCurrentTime().printCurrentTime();
			System.out.println("=========Create Time ========");
			Thread.sleep(2345);
			lookupBean.createCurrentTime().printCurrentTime();
			Thread.sleep(12345);
			System.out.println("=========Second Time ========");
			lookupBean = (LookupBean)ac.getBean("lookupBean", LookupBean.class);
			lookupBean.getCurrentTime().printCurrentTime();
			System.out.println("=========Create Time ========");
			lookupBean.createCurrentTime().printCurrentTime();
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
