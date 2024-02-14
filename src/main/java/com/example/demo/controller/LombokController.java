package com.example.demo.controller;

import com.example.demo.service.LombokMathService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LombokController {
    private final LombokMathService lombokMathService = new LombokMathService();
    @GetMapping("/maxValue")
    public Integer maxValue(@RequestParam int num1, @RequestParam int num2) {
        return lombokMathService.maxValue(num1, num2);
    }
}
