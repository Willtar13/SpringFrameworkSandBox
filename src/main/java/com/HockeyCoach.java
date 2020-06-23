package com;

import java.math.BigDecimal;

public class HockeyCoach implements Coach {

    private HappyFortuneService happyFortuneService;

    public HockeyCoach(HappyFortuneService happyFortuneService) {
        this.happyFortuneService = happyFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Russian Circles";
    }

    @Override
    public String getDailyFortune() {
        return happyFortuneService.getFortune();
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
