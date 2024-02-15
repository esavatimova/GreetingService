package com.example.demo.service;

import org.springframework.stereotype.Component;



public class LombokMathService {
    public Integer maxValue(int a, int b){
        return(a>b?a:b);
    }
}
