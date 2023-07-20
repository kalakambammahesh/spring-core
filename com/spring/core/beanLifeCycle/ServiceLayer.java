package com.spring.core.beanLifeCycle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceLayer {
	
	DAOLayer dAOLayer;
	
	@Autowired
	public void setdAOLayer(DAOLayer dAOLayer) {
		this.dAOLayer = dAOLayer;
	}

	public List<Student> getAllStudents() {
		return dAOLayer.getAllStudents();
	}

}
