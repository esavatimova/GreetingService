package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public class LombokMathService {
    public Integer maxValue(int a, int b){
        return(a>b?a:b);
    }
}
