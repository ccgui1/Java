package com.ccgui.demo01;

public class Tenant {
    public static void main(String[] args){
        Proxy proxy = new Proxy(new Landlord());
        proxy.rent();
        proxy.vistHouse();
        proxy.signContract();
        proxy.getFee();
    }
}
