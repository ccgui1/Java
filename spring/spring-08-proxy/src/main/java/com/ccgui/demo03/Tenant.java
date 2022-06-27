package com.ccgui.demo03;



public class Tenant {
    public static void main(String[] args) {
        // 真实角色
        Landlord landlord =  new Landlord();

        // 代理角色
        ProxyInvocationHandler pIH = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理我们要调用的接口对象
        pIH.setRent(landlord);
        Rent proxy = (Rent) pIH.getProxy();
        proxy.rent();
    }
}
