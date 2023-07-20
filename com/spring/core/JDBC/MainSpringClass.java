package com.spring.core.JDBC;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringClass {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigClass.class);
		ServiceLayerClass serviceLayerClass = applicationContext.getBean(ServiceLayerClass.class);
		System.out.println("Size:"+serviceLayerClass.getAllStudents());
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
