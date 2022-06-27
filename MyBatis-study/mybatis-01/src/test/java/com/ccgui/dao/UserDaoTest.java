package com.ccgui.dao;

import com.ccgui.pojo.User;
import com.ccgui.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test() {
        // 第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userlists = userDao.getUserList();
        for (User userlist : userlists) {
            System.out.println(userlist);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User userById = userDao.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }

    // 增删改查需要提交事物
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.addUser(new User(5, "小白", "1234234"));
        if (res > 0) {
            System.out.println("插入成功！");
        }
        // 增删改一定要提交事务。
        sqlSession.commit();
        sqlSession.close();
    }

    // 修改用户信息
    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.updataUser(new User(4, "大白", "23423423423"));
        if (res > 0) {
            System.out.println("已修改成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    // 删除用户
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int  res = userMapper.deleteUser(5);
        System.out.println(res);

        sqlSession.commit();
        sqlSession.close();

    }
}