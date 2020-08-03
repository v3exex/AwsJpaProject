package com.jojo.book.springboot.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopConfig {

    @Before("execution(* com.jojo.book.springboot.web.HelloController.*(..))")
    public void doSomgthingBefore() {
        System.out.println("##### AOP - Before");
    }

    @After("execution(* com.jojo.book.springboot.web.HelloController.*(..))")
    public void doSomgthingAfter() {
        System.out.println("##### AOP - After");
    }

    @Around("execution(* com.jojo.book.springboot.web.HelloController.*(..))")
    public Object logging(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("proceed before");
        Object result = pjp.proceed();
        System.out.println("proceed after");
        return result;
    }
}
