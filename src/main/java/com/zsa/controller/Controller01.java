package com.zsa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller01 {
    @GetMapping()
    public String get(@PathVariable String age,String pass){
        System.out.println("hello git");
        return "hello world";
    }
}
