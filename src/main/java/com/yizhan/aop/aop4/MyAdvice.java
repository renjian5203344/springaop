package com.yizhan.aop.aop4;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {

    public void beforeOur() {
        System.out.println("-----------before-----------");
    }

    public void afterOur() {
        System.out.println("-----------after-----------");
    }

    public Object aroundOur(ProceedingJoinPoint joinpoint) throws Throwable {
        System.out.println("-----------around-----------");
        return joinpoint.proceed();
    }
}
