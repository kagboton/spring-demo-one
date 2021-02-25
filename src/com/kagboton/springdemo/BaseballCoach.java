package com.kagboton.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	//
	public BaseballCoach () {}
	
	// define constructor for the dependency injection
	public BaseballCoach(FortuneService fortuneService) {		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Baseball workout, you must practice a lot";
	}
	
	@Override
	public String getDailyFortune() {
		return "Baseball: " + fortuneService.getFortune();
	}

}
