package com.ccgui.demo02;

public class UserServiceImp implements UserService{

    @Override
    public void addUser() {
        System.out.println("添加了一个用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除一个用户");
    }

    @Override
    public void updateUser() {
        System.out.println("更新了一个用户");
    }

    @Override
    public void queryUser() {
        System.out.println("查询了一个用户");
    }
}
