package com.ccgui.service;

import com.ccgui.dao.UserDao;
import com.ccgui.dao.UserDaoIml;

public class UserServiceIml implements UserService {
    private UserDao userDao ;



    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }

}
