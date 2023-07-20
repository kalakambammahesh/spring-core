package com.spring.core.anntationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigClass.class);
		Student student = applicationContext.getBean(Student.class);
		System.out.println("checking:"+student.toString());
	}

}
