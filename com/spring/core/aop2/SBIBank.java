package com.spring.core.aop2;

import org.springframework.stereotype.Component;

@Component
public class SBIBank implements IRBI {

	@Override
	public void intrestRate(float interestPercentage) {
		System.out.println("Government Bank Intrest Rates");
	}
}
