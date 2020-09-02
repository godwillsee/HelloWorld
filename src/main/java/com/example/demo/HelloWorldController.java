package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{
    @RequestMapping("/hello")
    public String hello(){
        return "Hello ,Spring Boot!";
    }

    @RequestMapping("/helloB")
    @ResponseBody
    public String helloB() { return "Hello ,Spring Boot Again!"; }
}

