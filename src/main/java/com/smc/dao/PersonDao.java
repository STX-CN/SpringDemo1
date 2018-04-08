package com.smc.dao;

public abstract class PersonDao {
	
	protected String nation;
	protected int	  nationCode;
	
	public PersonDao(String nation, int code)
	{
	}
	
	public abstract void speak();
	public abstract String getNation();
	public abstract void setNation(String nation);
	public abstract void setNationCode(int code);
	public abstract int getNationCode();
	public abstract void display();
}
