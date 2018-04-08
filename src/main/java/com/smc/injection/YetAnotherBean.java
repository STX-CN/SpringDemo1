package com.smc.injection;

public class YetAnotherBean {
	
	private String name;
	
	public void setName(String strName)
	{
		this.name = strName;
	}
	
	public void display()
	{
		System.out.println("YetAnotherBean name:" + name);
	}
	
	
}
