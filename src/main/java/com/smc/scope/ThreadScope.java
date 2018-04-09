package com.smc.scope;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope{
	
	//保存所有bean实例对象
	private static Map container = Collections.synchronizedMap(new HashMap());
	
	public Object get(String name, ObjectFactory<?> objectFactory) {
		Map beans = (Map)container.get(getThreadId());
		if(beans == null)
		{
			beans = new HashMap();
			container.put(getThreadId(), beans);
		}
		Object obj = beans.get(name);
		if(obj == null)
		{
			obj = objectFactory.getObject();
			beans.put(name, obj);
		}
		return obj;
	}

	public Object remove(String name) {
		Map beans = (Map)container.get(getThreadId());
		if(beans != null)
		{
			Object obj = beans.get(name);
			if(obj != null)
			{
				beans.remove(name);
				return obj;
			}
		}
		return null;
	}

	public void registerDestructionCallback(String name, Runnable callback) {
		System.out.println("registerDestructionCallback...");
	}

	public Object resolveContextualObject(String key) {
		return null;
	}

	public String getConversationId() {
		return	Thread.currentThread().getName();
	}

	private Long getThreadId()
	{
		long id = Thread.currentThread().getId();
		return Long.valueOf(id);
	}
	
}
