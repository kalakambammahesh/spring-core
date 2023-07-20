package com.spring.core.beanAnnotation;

public class College {
	
	private Principal principal;
	
	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public College() {}
	
	public College(Principal principal) {
		this.principal = principal;
	}

}
