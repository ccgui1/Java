package com.ccgui.dao;

import com.ccgui.pojo.User;
import org.apache.ibatis.annotations.*;

import java.lang.annotation.Inherited;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUser();

    //方法存在多个参数，所有的参数前面必须加上@Param("id")注解
    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    //删除用户的信息
    @Delete("Delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);
}
