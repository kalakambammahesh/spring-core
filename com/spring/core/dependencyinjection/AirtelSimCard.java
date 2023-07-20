package com.spring.core.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AirtelSimCard implements SimCard {
	
	@Autowired
	@Qualifier("internetServiceN")
	InternetService internetServiceNN;

	public InternetService getInternetService() {
		return internetServiceNN;
	}

	public void setInternetService(InternetService internetService) {
		this.internetServiceNN = internetService;
	}

	@Override
	public void calling() {
		System.out.println("Airtel Calling");
	}

	@Override
	public void hangUpCall() {
		System.out.println("Airtel HangUp");
	}

	@Override
	public void internetServices() {
		internetServiceNN.internerService();
	}
	
}
