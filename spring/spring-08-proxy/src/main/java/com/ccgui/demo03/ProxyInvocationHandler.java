package com.ccgui.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
// InvocationHandler handler = new MyInvocationHandler(...);
// Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class<?>[] { Foo.class }, handler);

    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理类
    public  Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果。
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        vistHost();
        Object result = method.invoke(rent, args);
        getFee();
        return result;
    }

    public void vistHost(){
        System.out.println("中介带看房子");
    }

    public void getFee(){
        System.out.println("收中介费");
    }
}
