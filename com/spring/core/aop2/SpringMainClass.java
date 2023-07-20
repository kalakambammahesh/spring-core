package com.spring.core.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMainClass {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigClass.class);
		IntrestRateCalculator object = applicationContext.getBean(IntrestRateCalculator.class);
		object.processStart();
	}

}
