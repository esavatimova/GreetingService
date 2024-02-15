package com.example.demo.config;

import com.example.demo.service.GreetingService;
import com.example.demo.service.LombokMathService;
import com.example.demo.service.MathService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }

    @Bean
    public LombokMathService lombokMathService() {
        return new LombokMathService();
    }

    @Bean
    public MathService mathService() {
        return new MathService();
    }
}
