package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCDemoController {
    @GetMapping("/mvcdemo")
    public ModelAndView hello(){
        User user = new User();
        user.setName("zzy");
        user.setAge(25);
        ModelAndView modelAndView = new ModelAndView("mvcdemo");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
