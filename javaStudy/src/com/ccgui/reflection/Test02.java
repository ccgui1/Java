package com.ccgui.reflection;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
//      Class c1 =   Class.forName("com.ccgui.reflection.User");
//      System.out.println(c1);
        User user =  new User();
        Class c1 = com.ccgui.reflection.User.class;
        Class c2 = user.getClass();
        Class c3 = Class.forName("com.ccgui.reflection.User");
        Class c4 = Integer.TYPE;
        System.out.println(c1.hashCode() + "  " +  c2.hashCode()  + "  "+  c3.hashCode() +"  "+ c4.hashCode());


    }
}

//实体类: pojo, entity
class User {
    private String name;
    private Integer id;
    private Integer age;

    public User() {
    }

    public User(String name, Integer id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return  "姓名：" + name + "年龄：" + age + "id：" + id;
    }
}

