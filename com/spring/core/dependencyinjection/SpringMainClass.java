package com.spring.core.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		SimCard simCard =  applicationContext.getBean(AirtelSimCard.class);
		System.out.println("SimCard:"+simCard.getClass().getCanonicalName());
		simCard =  applicationContext.getBean(JioSimCard.class);
		System.out.println("SimCard:"+simCard.getClass().getCanonicalName());
		simCard.internetServices();
	}

}
