package com.ccgui.demo01;

public class Proxy {
    // 利用代理实现对租房功能的代理
    private Landlord landlord;

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    public  void rent(){
        landlord.rent();
    }

    // 看房
    public void vistHouse(){
        System.out.println("中介看房");
    }

    // 签订合同
    public void signContract(){
        System.out.println("签订合同");
    }

    // 收取服务费
    public void getFee(){
        System.out.println("收取服务费");
    }


}
