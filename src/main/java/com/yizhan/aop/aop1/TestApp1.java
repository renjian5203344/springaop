package com.yizhan.aop.aop1;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;

/**
 */
public class TestApp1 {
	public static void main(String[] args) {
		IDinner target=new ImplDinner();
		ProxyFactory proxyFactory=new ProxyFactory(target);

		RegexpMethodPointcutAdvisor badvisor=new RegexpMethodPointcutAdvisor();
		badvisor.setAdvice(new BeforeAdvice());
		badvisor.setPattern(".*IDinner.*method*.*");
		proxyFactory.addAdvisor(badvisor);

		RegexpMethodPointcutAdvisor aadvisor=new RegexpMethodPointcutAdvisor();
		aadvisor.setAdvice(new AfterAdvice());
		aadvisor.setPattern(".*.*");
		proxyFactory.addAdvisor(aadvisor);


		IDinner iStudent=(IDinner)proxyFactory.getProxy();
		iStudent.method1("p1");
		System.out.println("----------------------------");
		iStudent.method2("p2");
	}
}
