package com.ccgui.diy;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.ccgui.service.UserServiceImpl.*(..))")
    public  void before(){
        System.out.println("============执行方法前===========");
    }
}

