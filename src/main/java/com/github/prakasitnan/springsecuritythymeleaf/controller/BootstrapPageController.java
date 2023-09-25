package com.github.prakasitnan.springsecuritythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bootstrapPage")
public class BootstrapPageController {

    @RequestMapping("/template1")
    String template1(){
        return "bootstrapPage/template1";
    }

    @RequestMapping("/template2")
    String template2(){
        return "bootstrapPage/template2";
    }

    @RequestMapping("/template3")
    String template3() {
        return "bootstrapPage/template3";
    }

}
