package com.spring.core.JDBC;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.spring.core.JDBC"})
@PropertySource("classpath:db.jdbc.properties")
public class JavaConfigClass {}
