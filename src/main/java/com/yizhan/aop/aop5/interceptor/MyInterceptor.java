package com.yizhan.aop.aop5.interceptor;


import lombok.extern.log4j.Log4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

/**
 * 切面
 */
@Aspect
@Log4j
@Service("my1")
public class MyInterceptor {
	@Pointcut("execution(* com.demo.aop.aop5.PersonServiceImpl.*(..))")
	private void anyMethod(){}//定义一个切入点
	
	@Before("anyMethod() && args(name)")
	public void doAccessCheck(String name){
		log.info("MyInterceptor1-anyMethod-   "+name);
	}
	
	@AfterReturning("anyMethod()")
	public void doAfter(){
		log.info("MyInterceptor1-doAfter");
	}
	
	@After("anyMethod()")
	public void after(){
		log.info("MyInterceptor1-after");
	}
	
	@AfterThrowing("anyMethod()")
	public void doAfterThrow(){
		log.info("MyInterceptor1---doAfterThrow");
	}
	
	@Around("anyMethod()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
		log.info("MyInterceptor1---before");
		Object object = pjp.proceed();//执行该方法
		log.info("MyInterceptor1--after");
		return object;
	}
}