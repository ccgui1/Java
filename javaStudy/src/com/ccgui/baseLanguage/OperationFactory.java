package com.ccgui.baseLanguage;

public class OperationFactory{
    public static Opertation create(String operate){
        Opertation oper = null;
        switch (operate) {
            case  "+":
                oper  = new OperationAdd();
                break;
            case "-":
                oper  =  new OperationSub();
                break;
            case "*":
                oper  = new OperationMul();
                break;
            case "/":
                oper  = new OperationDiv();
                break;
            default:
                System.out.println("请输入符合格式的值");
        }
        return oper;
    }
}