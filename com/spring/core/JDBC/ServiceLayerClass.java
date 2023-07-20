package com.spring.core.JDBC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceLayerClass {
	
	@Autowired
	DAOLayerClass dAOLayerClass;
	
	public List<StudentN> getAllStudents() {
		return dAOLayerClass.getAllStudents();
	}

}
