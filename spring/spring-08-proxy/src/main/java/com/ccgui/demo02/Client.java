package com.ccgui.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy userServiceImp = new UserServiceProxy(new UserServiceImp());
        userServiceImp.addUser();

    }
}
