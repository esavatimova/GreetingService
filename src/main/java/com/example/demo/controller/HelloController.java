package com.example.demo.controller;

import com.example.demo.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return greetingService.helloWorld();
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "test") String name, @RequestParam String age) {
        return greetingService.hello(name, age);
    }
}