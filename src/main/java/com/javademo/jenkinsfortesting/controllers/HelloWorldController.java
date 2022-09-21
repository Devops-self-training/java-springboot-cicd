package com.javademo.jenkinsfortesting.controllers;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public ResponseEntity<String> HelloWorld(){
        return new ResponseEntity<>("Hello world",HttpStatus.OK);
    }
}