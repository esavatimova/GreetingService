package com.example.demo.service;

import org.springframework.stereotype.Component;


public class MathService {
    public Integer minValue(int a, int b){
        return(a<b?a:b);
    }


    public String fizzBuzz(int i){
        if(i%5==0 && i%3!=0) {
            return "Buzz";
        } else if(i%5!=0 && i%3==0) {
            return "Fizz";
        } else if(i%5==0 && i%3==0) {
            return "FizzBuzz";
        } else return "No FizzBuzz";
    }
}
