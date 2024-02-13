package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String hello(String name, String age) {
        return  "Hello "+ name +", your age is " + age;
    }

    public String helloWorld() {
        return "Hello world";
    }

}
