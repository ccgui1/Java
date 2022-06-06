package com.ccgui.reflection;

import java.lang.reflect.Field;
import java.util.PrimitiveIterator;

public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("main");
//        Class.forName("com.ccgui.reflection.People");
//        Student student = new Student();
//        Student.showName();
//        System.out.println(student.id);
//          Class c1 = Class.forName("com.ccgui.reflection.Student");
//         System.out.println(c1.getDeclaredFields());
//        Student student = new Student();
        Student student = new Student();
        Class  c1 = student.getClass();
        for( Field field : c1.getFields()){
            System.out.println(field);
        }
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