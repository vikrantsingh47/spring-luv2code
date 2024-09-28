package com.vikrantsingh47.springboot.demo.myapp.coach;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("inside constructor: " + this.getClass().getSimpleName());
    }

    // define bean lifecycle init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("inside doMyStartupStuff(): " + this.getClass().getSimpleName());
    }

    // define bean lifecycle destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("inside doMyCleanupStuff(): " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

}
