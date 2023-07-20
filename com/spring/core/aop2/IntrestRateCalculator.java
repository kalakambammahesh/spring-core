package com.spring.core.aop2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IntrestRateCalculator {

	@Autowired
	@Qualifier("SBIBank")
	IRBI bankObject;

	public void setBankObject(IRBI bankObject) {
		this.bankObject = bankObject;
	}
	
	public void processStart() {
		bankObject.intrestRate(1.00f);
	}
}
