package com;

import java.math.BigDecimal;

public class BaseballCoach implements Coach {

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection (constructor injection)
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    //This is a dependency (or helper)
    @Override
    public String getDailyFortune() {

        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

    @Override
    public String getEmailAddress() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }

    @Override
    public BigDecimal getYear() {
        return null;
    }

}
