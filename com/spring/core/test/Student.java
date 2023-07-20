package com.spring.core.test;

public class Student {
	int id;
	String name;
	StudentC studentC;
	public StudentC getStudentC() {
		return studentC;
	}
	public void setStudentC(StudentC studentC) {
		this.studentC = studentC;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
