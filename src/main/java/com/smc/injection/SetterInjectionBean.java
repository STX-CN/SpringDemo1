package com.smc.injection;

public class SetterInjectionBean {
	
	private AnotherBean	anotherBean;
	private YetAnotherBean	yetAnotherBean;
	
	public AnotherBean getAnotherBean()
	{
		return anotherBean;
	}
	
	public void setAnotherBean(AnotherBean anotherBean)
	{
		this.anotherBean = anotherBean;
	}
	
	public YetAnotherBean getYetAnotherBean()
	{
		return yetAnotherBean;
	}
	
	public void setYetAnotherBean(YetAnotherBean yetAnotherBean)
	{
		this.yetAnotherBean = yetAnotherBean;
	}
	
	public void display()
	{
		System.out.println("SetterInjection display...");
		anotherBean.display();
		System.out.println("\n");
		yetAnotherBean.display();
	}
	
	
}
