package com.example.SpringBootValidation.controller;

import com.example.SpringBootValidation.entities.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MyController {

    @GetMapping("/form")
    public String form(Model model){
        System.out.println("in form...");
        model.addAttribute("loginData", new LoginData());
        return "form";
    }

    //handler for processing form
    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result ){
        if(result.hasErrors()){
            System.out.println(result);
            return "form";
        }
        System.out.println(loginData);
        return "success";
    }
}
