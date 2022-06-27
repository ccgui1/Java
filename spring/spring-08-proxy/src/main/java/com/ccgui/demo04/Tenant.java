package com.ccgui.demo04;

import com.ccgui.demo02.UserService;
import com.ccgui.demo02.UserServiceImp;

public class Tenant {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImp userServiceImp = new UserServiceImp();
        // 代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(userServiceImp);
        UserService proxy = (UserService) pih.getProxy();

        proxy.addUser();

    }

}
