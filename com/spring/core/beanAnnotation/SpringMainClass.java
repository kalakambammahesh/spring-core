package com.spring.core.beanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigClass.class);
		
		College college = applicationContext.getBean("college1",College.class);
		System.out.println(college.getPrincipal().getName());
		
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
