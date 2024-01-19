package com.rdevs.springboot.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    // expose "/" to return hello world.
    @GetMapping
    public String sayHello(){
       return  "hello world";
    }
}
