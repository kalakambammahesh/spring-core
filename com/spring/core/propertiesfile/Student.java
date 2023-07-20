package com.spring.core.propertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	String name;
	@Value("${student.age}")
	String age;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("Setter Name");
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		System.out.println("Setter age");
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
