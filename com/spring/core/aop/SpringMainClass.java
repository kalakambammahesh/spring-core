package com.spring.core.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainClass {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-aop.xml");
		Circle circle = applicationContext.getBean(Circle.class);
		System.out.println("Shape Name First:"+circle.getName());
		Triangle triangle = applicationContext.getBean(Triangle.class);
		System.out.println("Shape Name Second:"+triangle.getName());
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
