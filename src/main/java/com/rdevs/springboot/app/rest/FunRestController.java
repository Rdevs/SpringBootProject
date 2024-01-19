package com.rdevs.springboot.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    // expose "/" to return hello world.
    @GetMapping("/")
    public String sayHello(){
       return  "hello world";
    }

    // expose "/landing_page"
    @GetMapping("/landing_page")
    public String openLandingPage(){
        return  "Welcome to the landing page :)";
    }

    // expose "/extra_endpoint"
    @GetMapping("/extra_endpoint")
    public String openExtraLandingPage(){
        return  "  Welcome to the extra endpoint's landing page :)";
    }
}
