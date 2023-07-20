package com.spring.core.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
public class LoggingAspect {
	
	//JoinPoint		//PointCut
	@Before("execution(public String getName())")
	public void LogginAdvice() {//Advice is action.
		System.out.println("Advice run. Get Method called.");
	}

}
