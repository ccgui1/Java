package com.ccgui.baseLanguage;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

// 简单工厂模式
// 加减乘除功能
public class Test0621 {
    public static  void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Scanner reader = new Scanner(System.in);
//        Double numberA = reader.nextDouble();
//        Double numberB = reader.nextDouble();
        OperationFactory operationFactory = new OperationFactory();
        Opertation opertation = operationFactory.create("/");
        opertation.numberA = 12.0;
        opertation.numberB = 0.0;
        System.out.println(opertation);
    }
}

// 工厂类，用来管理加减乘除类
//创建实体类
class Opertation{
    protected Double numberA;
    protected Double numberB;

    //无参构造
    public Opertation() {
    }
    // 有参构造
    public Opertation(Double numberA,Double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }


    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    @Override
    public String toString() {
        return "Opertation{" +
                "numberA=" + numberA +
                ", numberB=" + numberB +
                '}';
    }
}
// 加减乘除类
class  OperationAdd extends Opertation{
    @Override
    public  String toString(){
       return  String.valueOf(numberA + numberB) ;
    }
}

class  OperationSub extends Opertation{
    @Override
    public  String toString(){
        return  String.valueOf(numberA - numberB) ;
    }
}

class  OperationMul extends Opertation{
    @Override
    public  String toString(){
        return  String.valueOf(numberA * numberB) ;
    }
}

class  OperationDiv extends Opertation{
    @Override
    public  String toString(){
        if (numberB == 0){
            return "除数不能为0";
        }else{
            return  String.valueOf(numberA / numberB) ;
        }
    }
}

