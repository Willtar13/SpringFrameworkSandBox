package com;

import java.math.BigDecimal;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;
    private BigDecimal year;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setYear(BigDecimal year) {
        this.year = year;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket is slow and stupid";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String getTeam() {
        return this.team;
    }

    @Override
    public BigDecimal getYear() {
        return year;
    }
}
