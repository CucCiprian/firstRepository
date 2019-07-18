package com.jcombat.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public MyBean myBean() {
		return new MyBeanImpl();
	}
	
	@Bean(name = "b2")
	public MyBean myOtherImpl() {
		return new MyOtherImpl();
	}

}
