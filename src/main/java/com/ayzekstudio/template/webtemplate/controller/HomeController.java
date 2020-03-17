package com.ayzekstudio.template.webtemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public HomeController() {
    }

    @GetMapping("/")
    public String homeMapping(){
        return "Hello World!";
    }
}
