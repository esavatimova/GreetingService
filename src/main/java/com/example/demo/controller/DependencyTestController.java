package com.example.demo.controller;

import com.example.demo.service.LombokMathService;
import com.example.demo.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyTestController {
    private MathService mathService;
    @Autowired
    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/minValue")
    public Integer minValue(@RequestParam int num1, @RequestParam int num2) {
        return mathService.minValue(num1, num2);
    }
    @GetMapping("/fizzBuzz")
    public String fizzBuzz(@RequestParam int i){
        return mathService.fizzBuzz(i);
    }

    //filed injection
    @Autowired
    private LombokMathService lombokMathService;

    @GetMapping("/fieldMaxValue")
    public Integer fieldMaxValue(@RequestParam int num1, @RequestParam int num2) {
        return lombokMathService.maxValue(num1, num2);
    }

}
