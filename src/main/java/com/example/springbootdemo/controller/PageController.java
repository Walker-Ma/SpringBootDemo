package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
    @RequestMapping(value = "/")
    public String root() {
        return "select_user";
    }
	
    @RequestMapping(value = "/addUser")
    public String addUser() {
        return "add_user";
    }

    @RequestMapping(value = "/editUser")
    public String editUser() {
        return "edit_user";
    }
    
    @RequestMapping(value = "/userSelect")
    public String userSelect() {
        return "select_user";
    }
}
