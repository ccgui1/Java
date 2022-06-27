package com.ccgui.dao;

import com.ccgui.pojo.User;
import com.ccgui.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserDaoTest {



    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User userById = userDao.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }


}