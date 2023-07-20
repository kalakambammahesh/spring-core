package com.spring.test;

public class Manager implements Human{
	
	int id;
	String name;
	boolean isManager;
	Address address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	@Override
	public void showInformation() {
		System.out.println("Manager [id=" + id + ", name=" + name + ", isManager=" + isManager + "]");
	}

	public Manager(int id, String name, boolean isManager, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.isManager = isManager;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", isManager=" + isManager + "]";
	}
	
}
