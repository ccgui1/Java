package com.ccgui.dao;

import com.ccgui.pojo.User;
import com.ccgui.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class
UserDaoTest {

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User userById = userDao.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }
    @Test
    public void testlog4j(){
        Logger logger = Logger.getLogger(UserDaoTest.class);
        logger.info("info:进入了log4j" );
        logger.debug("debug: 进入了");
        logger.error("error:爬爬爬");
    }

    @Test
    public  void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        HashMap<String,Integer> userMap = new HashMap<>();
        userMap.put("startIndex",0);
        userMap.put("pageSize",10);
        List<User> userLimit = mapper.getUserByLimit(userMap);
        for(User user : userLimit){
            System.out.println(user);
        }

        sqlSession.close();

    }
}