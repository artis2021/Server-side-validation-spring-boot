package com.example.SpringBootValidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExampleController {
    @RequestMapping(value = "/example", method = RequestMethod.GET)
    public String example(){
        return "example";
    }

}
