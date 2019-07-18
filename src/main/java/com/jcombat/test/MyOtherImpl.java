package com.jcombat.test;

import org.springframework.stereotype.Component;

@Component
public class MyOtherImpl implements MyBean {

	@Override
	public String someMethod() {
		return "Other Impl";
	}

}
