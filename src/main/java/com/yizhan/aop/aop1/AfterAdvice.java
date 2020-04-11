package com.yizhan.aop.aop1;

import lombok.extern.log4j.Log4j;
        import org.springframework.aop.AfterReturningAdvice;

        import java.lang.reflect.Method;

@Log4j
public class AfterAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("afterReturning£¬returnValue="+returnValue+"=="+method);
    }

}

