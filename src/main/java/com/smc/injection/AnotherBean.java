package com.smc.injection;

public class AnotherBean {
	
	protected String name;
	
	public void setName(String strName)
	{
		name = strName;
	}
	
	public void display()
	{
		System.out.println("AnotherBean name:" + name);
	}
}
