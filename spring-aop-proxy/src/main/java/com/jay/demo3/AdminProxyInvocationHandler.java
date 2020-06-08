package com.jay.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AdminProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private AdminServiceInterface adminServiceInterface;

    public void setAdminServiceInterface(AdminServiceInterface adminServiceInterface) {
        this.adminServiceInterface = adminServiceInterface;
    }

    /**
     * 生成代理类
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), adminServiceInterface.getClass().getInterfaces(), this);
    }

    /**
     * 处理代理实例，并返回结果
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return method.invoke(adminServiceInterface, args);
    }

    private void log(String msg){
        System.out.println("[debug]:执行了" + msg + "方法");
    }
}
