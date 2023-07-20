package com.spring.core.aop2;

import org.springframework.stereotype.Component;

@Component
public class HDFCBank implements IRBI {

	@Override
	public void intrestRate(float interestPercentage) {
		System.out.println("Private Banks HDFC Intreset Rates.");
	}

}
