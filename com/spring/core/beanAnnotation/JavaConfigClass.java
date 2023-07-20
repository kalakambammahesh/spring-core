package com.spring.core.beanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigClass {
	
	Principal principal;
	
	@Bean
	public Principal principal() {
		principal = new Principal();
		principal.setName("Mahesh K");
		return principal;
	}

	@Bean(name = {"college", "college1"})
	public College college() {
		College college = new College();
		college.setPrincipal(principal);
		return college;
	}
}
