package com.ccgui.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("main");
        Student student = new Student();
        Class  c1 = student.getClass();
        // 打印Student类的属性
        for( Field field : c1.getFields()){
            System.out.println(field);
        }

        // 打印类的方法
        // getMethods()（获取本类以及其父类的全部public方法）
        // getDeclareMethods() （获取本类的所有方法）
        Method[] methods = c1.getMethods();
        for (Method method : methods){
            System.out.println(method);
        }

        //获取指定方法
        // java中的重载，利用参数类型，指明使用的是哪个方法
        Method getName = c1.getMethod("getName");
        Method setName = c1.getMethod("setName", String.class);

        // 获取指定的构造器
        System.out.println("==========构造器============");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors ){
            System.out.println(constructor);
        }

        System.out.println(c1.getDeclaredConstructor(String.class,Integer.class));


    }
}

class People{
    static {
        System.out.println("People类初始化");
    }
}

class   Student extends People{
    private String name;
    public Integer id;

    public Student() {
    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }



    static {
    System.out.println("Student类初始化");
    }
    public  static void showName(){
        System.out.println("name: student");
    }
}