package com.spring.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee implements Human{
	
	int id;
	String name;
	boolean isWorking;
	public Employee() {
		super();
	}

	public Address getAddress() {
		return this.address1;
	}

	//@Autowired
	private Address address1;
	public void setAddress(Address address) {
		this.address1 = address;
	}

	public Employee(int id, String name, boolean isWorking) {
		super();
		this.id = id;
		this.name = name;
		this.isWorking = isWorking;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*
	 * public Employee(int id, String name, boolean isWorking) { super(); this.id =
	 * id; this.name = name; this.isWorking = isWorking; }
	 */

	public void setName(String name) {
		this.name = name;
	}

	public void setIsWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", isWorking=" + isWorking + "]";
	}

	@Override
	public void showInformation() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", isWorking=" + isWorking + "]");
		
	}
	
	

}
