package com.spring.core.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		
		ServiceLayer servicesLayer = context.getBean(ServiceLayer.class);
		System.out.println("Checking Students:"+servicesLayer.getAllStudents());
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
