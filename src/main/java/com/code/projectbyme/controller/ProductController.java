package com.code.projectbyme.controller;

import com.code.projectbyme.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("products",productService.getProducts());
        return "home";
    }

    @RequestMapping("/home")
    public String home2(Model model) {
        model.addAttribute("products",productService.getProducts());
        return "home";
    }

}
