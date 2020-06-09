package com.jay.way3.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log3 {

    @Before("execution(* com.jay.way3.service.ManageServiceImpl.*(..))")
    public void before(){
        System.out.println("注解实现前置通知");
    }

    @Around("execution(* com.jay.way3.service.ManageServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕执行前");
        Object proceed = jp.proceed();
        System.out.println("环绕执行后");
    }

}
