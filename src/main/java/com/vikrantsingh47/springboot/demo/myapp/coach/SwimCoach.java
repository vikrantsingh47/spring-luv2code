package com.vikrantsingh47.springboot.demo.myapp.coach;

// not using @Component annotation here, instead configuring this class as a bean using java config,  using @Bean annotation in SportConfig class
public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("inside constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

}
