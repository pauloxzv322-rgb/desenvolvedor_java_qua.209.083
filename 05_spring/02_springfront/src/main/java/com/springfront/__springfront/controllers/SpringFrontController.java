package com.springfront.__springfront.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringFrontController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping ("/formulario")
    public String formulario() {
        return "form";
    }
}
