package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
	public static void main(String[] args) {
		System.out.println("Starting Main Method.");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		//
		/*
		 * Employee empInstance = applicationContext.getBean(Employee.class);
		 * System.out.println(empInstance.toString());
		 * System.out.println(empInstance.address.getClass().getCanonicalName());
		 */
		
		//Loose Coupling.
		
		/*
		 * Human human = applicationContext.getBean("Employee", Employee.class);
		 * human.showInformation();
		 */
		
		//Autowire Example
		
		Employee employee = applicationContext.getBean("Employee", Employee.class);
		employee.showInformation();
		System.out.println(employee.getAddress());
		 
		
		System.out.println("End of Main Method.");
	}

}
