package com.spring.core.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class JioSimCard implements SimCard {
	
	@Autowired
	InternetService internetService;

	public InternetService getInternetService() {
		return internetService;
	}

	public void setInternetService(InternetService internetService) {
		this.internetService = internetService;
	}

	@Override
	public void calling() {
		System.out.println("Jio Calling");
	}

	@Override
	public void hangUpCall() {
		System.out.println("Jio HangUp");
	}
	
	@Override
	public void internetServices() {
		internetService.internerService();
	}

}
