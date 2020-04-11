package com.yizhan.aop.aop1;

import lombok.extern.log4j.Log4j;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/** 
 */
@Log4j
public class BeforeAdvice implements MethodBeforeAdvice{ 

	public void before(Method method, Object[] objects, Object o) throws Throwable {
		log.info("before");
	}
} 

