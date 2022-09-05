package com.code.projectbyme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {

    //mapping



    @RequestMapping("/header")
    public String header() {
        return "header";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }
}
