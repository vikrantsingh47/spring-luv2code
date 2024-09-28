package com.vikrantsingh47.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikrantsingh47.springboot.demo.myapp.coach.Coach;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;
    private Coach swimCoach;

    // constructor injection
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach,
            @Qualifier("swimCoach") Coach theSwimCoach) {
        System.out.println("inside constructor: " + this.getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
        swimCoach = theSwimCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/swimWorkout")
    public String getSwimWorkout() {
        return swimCoach.getDailyWorkout();
    }

    @GetMapping("/checkBeanScope")
    public String checkBeanScope() {
        return "myCoach and anotherCoach are same: " + (myCoach == anotherCoach);
    }
}
