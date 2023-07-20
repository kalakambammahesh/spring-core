package com.spring.core.anntationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.core.anntationconfig")
@PropertySource(value =  "classpath:student-info.properties")
public class JavaConfigClass {}
