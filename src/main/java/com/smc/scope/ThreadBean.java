package com.smc.scope;

public class ThreadBean {
	private int status = 0;
	
	public int getStatus()
	{
		return status;
	}
	
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	public void display()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Thread").append(Thread.currentThread().getId());
		sb.append(" status:\t").append(getStatus());
		System.out.println(sb.toString());
	}
	
}
