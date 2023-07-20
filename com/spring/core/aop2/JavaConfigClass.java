package com.spring.core.aop2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.spring.core.aop2"})
@EnableAspectJAutoProxy
public class JavaConfigClass {}
