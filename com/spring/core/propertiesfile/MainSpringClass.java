package com.spring.core.propertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringClass {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Student student = applicationContext.getBean("studentP", Student.class);
		System.out.println(student.toString());
	}

}
