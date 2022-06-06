package com.ccgui.reflection;
import  com.ccgui.reflection.People;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // 获取class对象
        Class c1 = Class.forName("com.ccgui.reflection.Teacher");

        // 构造一个对象(无参构造器)
        Teacher  teacher=(Teacher) c1.getDeclaredConstructor().newInstance();
        System.out.println(teacher);

        // 构造一个对象(有参构造器）
        Teacher teacher1=(Teacher)c1.getDeclaredConstructor(String.class,String.class).newInstance("张三","学习");
        System.out.println(teacher1);

        // 通过反射调用普通方法
        Teacher teacher2 = (Teacher) c1.getDeclaredConstructor().newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        // 注意是是方法的值（setName）
        // invoke : 激活的意思
        // (对象，“方法的值”)
        setName.invoke(teacher2,"憨八龟");
        System.out.println(teacher2.getName());

        // 通过反射操作属性值
        Teacher teacher3 = (Teacher) c1.getDeclaredConstructor().newInstance();
        Field name = c1.getDeclaredField("name");

        // 不能直接操作私有属性，我们需要关闭程序的安全检测
        // 属性或者方法的setAccessible(true)
        name.setAccessible(true);
        name.set(teacher3, "狂神");
        System.out.println(teacher3.getName());
    }
}
// 创建新类Teacher继承People类
class Teacher extends People{
    private String name;
    private String job;

    // 无参构造器
    public Teacher(){

    }
    // 有参构造器
    public Teacher(String name,String job){
        this.name = name;
        this.job = job;
    }
    //属性封装
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public  void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return this.job;
    }

    @Override
    public String toString(){
        return "Teacher: " + name + " job: " + job;
    }

}