package com.ccgui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/h2")
public class HelloController {
    @RequestMapping("/h2")
    public String sayHello(Model model){
        model.addAttribute("msg","hello!");
        return "hello";  // WEB-INF/jsp/hello.jsp
    }

    @RequestMapping("/add/{a}/{b}")
    public String addNums(@PathVariable int a, @PathVariable  int b, Model model){
        int res = a + b;
        model.addAttribute("msg","结果为"+res);
        return "hello";
    }
    @RequestMapping("/hello")
    public String hello(@RequestParam("testname") String name){
        System.out.println(name);
        return "hello";
    }
}

