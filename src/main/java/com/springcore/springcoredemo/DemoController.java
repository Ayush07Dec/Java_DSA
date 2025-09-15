package com.springcore.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //Define a private field for the dependency
    private Coach myCoach;

    //Define a constructor for dependency injection
    //Autowired's annotation tell spring to inject the dependency.
    //If you have only one constructor then @Autowired on constructor is optional.
    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }


    @RequestMapping("/dailyWorkout")
    String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


}
