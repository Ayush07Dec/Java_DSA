package com.springcore.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice running for 15 min daily. HELLO AYUSH its 14th April 2024 Sunday, Grind Hard gonna make your future easy champ.  ";
    }
}
