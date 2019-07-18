package com.jcombat.test;

public class MyBeanWithInjectionImpl implements MyBean {
	
	private final MyBean myBean;
	
	public MyBeanWithInjectionImpl(final MyBean myBean) {
		this.myBean = myBean;
	}

	@Override
	public String someMethod() {
		return myBean.someMethod() + " + From Injection";
	}

}
