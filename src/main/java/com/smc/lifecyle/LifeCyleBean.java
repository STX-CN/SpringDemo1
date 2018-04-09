package com.smc.lifecyle;

public class LifeCyleBean {
	private String message;
	
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public void initialize()
	{
		System.out.println("initialize");
		System.out.println(getMessage());
	}
	
	public void cleanUp()
	{
		System.out.println("Destroy Method...");
	}
	
}
