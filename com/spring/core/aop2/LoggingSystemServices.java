package com.spring.core.aop2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingSystemServices {

	@Before("execution(public void processStart())")
	public void printLogger() {
		System.out.println("Printing Before loggers");
	}
	
	@Before("execution( * com.spring.core.aop2.*.intrestRate(..))")
	public void printLoggerNear() {
		System.out.println("Printing Before loggers");
	}
	
	@Pointcut("execution(public void processStart())")
	public void afterPointCut() {
		
	}
	
	@After("afterPointCut() && allGetters()")
	public void afterLogger() {
		System.out.println("After logger statements.");
	}
	
	@Pointcut("within(com.spring.core.aop2.HDFCBank)")
	public void allGetters() {
		
	}

}
