package com.jay.demo3;

public class Client {
    public static void main(String[] args) {
        // 真实角色，被代理类
        AdminServiceImpl adminService = new AdminServiceImpl();
        AdminProxyInvocationHandler handler = new AdminProxyInvocationHandler();
        // 设置被代理类的对象，处理实现AdminServiceInterface接口的所有类
        handler.setAdminServiceInterface(adminService);
        // 动态生成代理类
        AdminServiceInterface proxy = (AdminServiceInterface) handler.getProxy();
        proxy.add();
    }
}
