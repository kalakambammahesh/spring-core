package com.spring.core.aurowireXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Human human = applicationContext.getBean(Human.class);
		System.out.println("Is Human Alive?");
		human.isHumanAlive();
	}

}
