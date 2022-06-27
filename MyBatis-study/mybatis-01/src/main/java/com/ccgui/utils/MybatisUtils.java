package com.ccgui.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

// 获取SqlSessionFactory
public class MybatisUtils {
    private  static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            // 第一步
            // 使用Mybait获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }  catch (IOException e){
            e.printStackTrace();
        }

    }
    public static SqlSession getSqlSession(){
        return  sqlSessionFactory.openSession();
    }

}
