package com.smc.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ChinesePersonDaoImpl {
	
	protected String nation;
	protected int	  nationCode;
	protected List<String> featureList;
	protected Properties	nationProperty;
	protected Map<String, String> nationMap;
	
	
	public ChinesePersonDaoImpl(String nation, int code)
	{
		this.nation = nation;
		this.nationCode = code;
	}
	
	public void speak() {
		System.out.println("speak chinese...");
	}

	public String getNation() {
		return nation;
	}

	public void setNationCode(int code) {
		this.nationCode = code;
	}
	
	public int getNationCode() {
		return nationCode;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public void display()
	{
		System.out.println("nation: " + nation + "  code: " + nationCode);
	}
	
	public void setFeatureList(List list)
	{
		featureList = list;
	}
	
	public void setNationProperty(Properties property)
	{
		nationProperty = property;
	}
	
	public void setNationMap(Map map)
	{
		nationMap = map;
	}
	
	public void displayFeature()
	{
		System.out.println(featureList.toString());
	}
	
	public void displayProperty()
	{
		System.out.println(nationProperty.toString());
	}
	
	public void displayMap()
	{
		System.out.println(nationMap.toString());
	}
}


