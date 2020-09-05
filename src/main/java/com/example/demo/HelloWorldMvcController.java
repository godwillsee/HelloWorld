package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldMvcController {
    @RequestMapping("/helloworld")
    public String helloWorld(Model model) throws Exception{
        model.addAttribute("mav", "hello. Spring Boot!我是MVC结构");
        return "example/hello";
    }
}
