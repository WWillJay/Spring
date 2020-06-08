package com.jay.way1.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(" [method]:" + method.getName() + " [args]:" + objects + " [Object class]:" + o.getClass());
    }
}
