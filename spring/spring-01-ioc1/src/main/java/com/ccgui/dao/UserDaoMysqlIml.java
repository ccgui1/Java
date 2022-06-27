package com.ccgui.dao;

public class UserDaoMysqlIml  implements UserDao{
    @Override
    public  void  getUser(){
        System.out.println("用户使用mysql");
    }
}
