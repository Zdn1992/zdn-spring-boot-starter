package com.zdn.controller;

import com.zdn.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/autoconfig")
    public Object testAutoConfig(){
        return helloService.sayToNewYear();
    }
}
