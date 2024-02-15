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
@RequestMapping("/setter")
public class SetterController {
    private GreetingService greetingService;
    private MathService mathService;
    private LombokMathService lombokMathService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Autowired
    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

    @Autowired
    public void setLombokMathService(LombokMathService lombokMathService) {
        this.lombokMathService = lombokMathService;
    }

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
    public String fizzBuzz(@RequestParam int i) {
        return mathService.fizzBuzz(i);
    }

    @GetMapping("/maxValue")
    public Integer fieldMaxValue(@RequestParam int num1, @RequestParam int num2) {
        return lombokMathService.maxValue(num1, num2);
    }
}
