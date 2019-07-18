package com.jcombat.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CLR implements CommandLineRunner {
	
	@Autowired
	private MyBean myBeanImpl;
	
	@Autowired
	private MyBean myBean;
	
	@Resource(name = "myBean")
	private MyBean myBean2;
	
	@Autowired
	private MyBean myOtherImpl;
	
	@Autowired
	private MyBean b2;
	
	@Resource(name = "b2")
	private MyBean b22;

	@Override
	public void run(String... args) throws Exception {
		myBeanImpl.someMethod();
		myOtherImpl.someMethod();
	}

}
