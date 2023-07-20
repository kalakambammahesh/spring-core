package com.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		  Student student = applicationContext.getBean(Student.class);
		  System.out.println("Student Instance:"+student);
		  System.out.println("Studnet ID :"+student.getId());
		  System.out.println("Student name:"+student.getName());
		 System.out.println("StudentC:"+student.getStudentC());

		/*
		 * StudentC studentC = applicationContext.getBean(StudentC.class);
		 * System.out.println("StudentC:"+studentC);
		 * System.out.println("StudentC ID:"+studentC.id);
		 * System.out.println("StudentC name:"+studentC.name); StudentC studentCC =
		 * applicationContext.getBean(StudentC.class);
		 * System.out.println("StudentC:"+studentCC);
		 */
	}

}
