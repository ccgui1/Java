package com.ccgui.dao;

import com.ccgui.pojo.User;
import com.ccgui.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;


public class
UserDaoTest {

    @Test
    public void getUsers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> users = userDao.getUser();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(6,"hello","12345"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    // 根据uid修改用户信息
    public  void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User(5,"hello1","234234"));

        sqlSession.commit();
        sqlSession.close();
    }

    //根据id删除用户
    @Test
    public void  deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser(5);
        sqlSession.commit();
        sqlSession.close();
    }
}