package com.smc.lifecyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {
	
	public static void main(String[] args)
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/smc/lifecyle/LifeCyleBean.xml");
		LifeCyleBean lifeCycleBean = ac.getBean("lifeCyleBean", LifeCyleBean.class);
	}
	
	
}
