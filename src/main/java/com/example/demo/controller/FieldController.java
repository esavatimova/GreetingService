package com.example.demo.controller;

import com.example.demo.service.GreetingService;
import com.example.demo.service.LombokMathService;
import com.example.demo.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/field")
public class FieldController {
    @Autowired
    private GreetingService greetingService;
    @Autowired
    private MathService mathService;
    @Autowired
    private LombokMathService lombokMathService;

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return greetingService.helloWorld();
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "test") String name, @RequestParam String age) {
        return greetingService.hello(name, age);
    }
    @GetMapping("/minValue")
    public Integer minValue(@RequestParam int num1, @RequestParam int num2) {
        return mathService.minValue(num1, num2);
    }
    @GetMapping("/fizzBuzz")
    public String fizzBuzz(@RequestParam int i){
        return mathService.fizzBuzz(i);
    }
    @GetMapping("/maxValue")
    public Integer fieldMaxValue(@RequestParam int num1, @RequestParam int num2) {
        return lombokMathService.maxValue(num1, num2);
    }
}
