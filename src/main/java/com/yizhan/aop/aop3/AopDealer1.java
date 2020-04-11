package com.yizhan.aop.aop3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AopDealer1 implements MethodInterceptor  {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("AopDealer1---invoke");
		
		return invocation.proceed();
	}

}
