package com.jcombat.test;

import org.springframework.stereotype.Component;

@Component
public class MyBeanImpl implements MyBean {

	@Override
	public String someMethod() {
		return "First Impl";
	}

}
