package com.smc.scope;

import com.smc.test.TestThreadBean;

public class ThreadService extends Thread{
	
	public void run()
	{
		for(int i = 0; i < 5; i ++)
		{
			ThreadBean bean = (ThreadBean)TestThreadBean.factory.getBean("theadBean");
			bean.setStatus(i+10);
			bean.display();
			long interval = (long)(Math.random()*100);
			try {
				sleep(interval);
			}catch(Exception e) {
				
			}
		}
	}

}
