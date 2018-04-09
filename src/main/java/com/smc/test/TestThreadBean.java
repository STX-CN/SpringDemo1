package com.smc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.smc.scope.ThreadScope;
import com.smc.scope.ThreadService;

public class TestThreadBean {
	
	public static BeanFactory factory;
	
	static {
		ClassPathResource resource = new ClassPathResource("com/smc/scope/TheadBeans.xml");
		factory = new XmlBeanFactory(resource);
		((XmlBeanFactory)factory).registerScope("thread", new ThreadScope());
	}
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 5; i ++)
		{
			ThreadService service = new ThreadService();
			service.start();
		}
	}
	
}
