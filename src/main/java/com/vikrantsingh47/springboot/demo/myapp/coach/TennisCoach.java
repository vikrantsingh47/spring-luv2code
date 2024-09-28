package com.vikrantsingh47.springboot.demo.myapp.coach;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("inside constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

}
