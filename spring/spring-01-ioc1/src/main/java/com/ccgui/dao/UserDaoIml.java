package com.ccgui.dao;

public class UserDaoIml implements UserDao{
    @Override
    public void getUser() {
        System.out.println("用户调用了数据");
    }


}
