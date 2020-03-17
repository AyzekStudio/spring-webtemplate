package com.ayzekstudio.template.webtemplate.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    public LoginController() {
    }

    @GetMapping("/")
    public ModelAndView homeMapping(){

        ModelAndView theModel = new ModelAndView("index");
        theModel.addObject("theDate", new java.util.Date());

        return theModel;
    }

    // Login form
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // Login form with error
    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }
}
