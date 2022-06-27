package com.ccgui.sql;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Testsql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. 用户信息和url
        String url="jdbc:mysql://localhost:3306/students?useUnicode=true&characterEncoding=UTF-8&useSSL=true";
        String username="root";
        String password="1";

        // 3. 连接成功，数据库对象
        Connection connection = DriverManager.getConnection(url, username, password);

        // 4. 执行sql的对象
        Statement statement = connection.createStatement();

        // 5. 执行sql的对象 去执行sql
        String sql = "SELECT * FROM employ";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println(resultSet.getObject("id"));
            System.out.println(resultSet.getObject("worknu"));
            System.out.println(resultSet.getObject("workname"));

        }
        // 6. 释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
