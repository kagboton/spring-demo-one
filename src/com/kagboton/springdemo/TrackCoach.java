package com.kagboton.springdemo;

public class TrackCoach implements Coach {
	
	// private field for dependency injection
	private FortuneService fortuneService;
	
	// no-arg constructor
	public TrackCoach() {
		System.out.println("TrackCoach - inside no-arg constructor");
	}
	
	// setter method for dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TrackCoach - inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Track workout";
	}	

	@Override
	public String getDailyFortune() {
		return "Track fortune: " + fortuneService.getFortune();
	}


	// add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach : inside init method");
	}
	// add a destroy method
	public void doMyCleanUpStuff(){
		System.out.println("TrackCoach : inside destroy method");
	}

}
