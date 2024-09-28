package com.vikrantsingh47.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose '/' that return "hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    // get custom properties from application.properties
    @Value("${team.name}")
    private String teamName;

    @Value("${team.location}")
    private String teamLocation;

    @GetMapping("/profile")
    public String profile(){
        return "Hello vikrant singh" + teamName + " from " + teamLocation;
    }
}
