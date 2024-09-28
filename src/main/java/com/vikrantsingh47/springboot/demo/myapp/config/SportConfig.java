package com.vikrantsingh47.springboot.demo.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vikrantsingh47.springboot.demo.myapp.coach.Coach;
import com.vikrantsingh47.springboot.demo.myapp.coach.SwimCoach;

// not using @Component annotation in SwimCoach.java, instead configuring this class as a bean using java config,  using @Bean annotation in SportConfig class
@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
