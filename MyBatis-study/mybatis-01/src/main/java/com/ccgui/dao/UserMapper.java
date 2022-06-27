package com.ccgui.dao;

import com.ccgui.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    // insert一个用户
    // insert into user values()
    int addUser(User user);

    // 修改用户
    int updataUser(User user);

    // 删除用户
    int deleteUser(int id);

}
