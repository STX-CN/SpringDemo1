package com.smc.injection;

public class ConstructInjectionBean {
	
	private AnotherBean  			anotherBean;
	private YetAnotherBean		yetAnotherBean;
	
	public ConstructInjectionBean(AnotherBean anotherBean, YetAnotherBean yetAnotherBean)
	{
		this.anotherBean = anotherBean;
		this.yetAnotherBean = yetAnotherBean;
	}
	
	public void display()
	{
		anotherBean.display();
		System.out.println("\n");
		yetAnotherBean.display();
		System.out.println("\n");
	}
}
