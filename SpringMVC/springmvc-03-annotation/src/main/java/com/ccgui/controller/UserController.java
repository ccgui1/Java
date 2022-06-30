package com.ccgui.controller;

import com.ccgui.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sound.midi.Soundbank;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String showName(@RequestParam("testname") String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }

    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }

    }


