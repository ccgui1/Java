package com.ccgui.reflection;

public class Test07 {

    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统类加载的父类加载器  ---> 扩展类加载器
        ClassLoader  parent = systemClassLoader.getParent();
        System.out.println(parent);

        // 获取扩展类加载器的父类加载器 ---> 根加载器（c/c++)
        System.out.println(parent.getParent());

        // 测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.ccgui.reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        System.out.println(Class.forName("java.lang.Object").getClassLoader());

        // 如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

    }
}


