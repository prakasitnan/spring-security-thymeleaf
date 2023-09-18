package com.github.prakasitnan.springsecuritythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    String home() {
        return "homepage/home";
    }
}
