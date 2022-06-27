package com.ccgui.demo02;

public class UserServiceProxy {
    private UserServiceImp userServiceImp;

    public UserServiceProxy(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    public void addUser(){
        msg("addUser");
        userServiceImp.addUser();
    }
    public void deleteUser() {
        msg("deleteUser");
        userServiceImp.deleteUser();
    }
    public void updateUser(){
        msg("updateUser");
        userServiceImp.updateUser();
    }
    public void queryUser() {
        msg("queryUser");
        userServiceImp.queryUser();
    }

    public void msg(String log){
        System.out.println("[debug]使用了" + log + "方法");

    }
}
