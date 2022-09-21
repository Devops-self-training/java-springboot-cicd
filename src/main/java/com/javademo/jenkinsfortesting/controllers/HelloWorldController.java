package com.javademo.jenkinsfortesting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RESTController;
@RESTController
public class HelloWorldController {
@GetMapping(“/hello-world”)
public String HelloWorld(){
return “Hello World”;
}
}