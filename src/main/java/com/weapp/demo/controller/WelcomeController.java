package com.weapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public  String  welcome(){
     return  "welcome demo1";
    }

    @GetMapping("/hi")
    public  String  welcometoMphasis(){
        return  "welcome to Mphasis";
    }

    @GetMapping("/uppal")
    public  String  welcometoUppal(){
        return  "welcome to Uppal";
    }


}