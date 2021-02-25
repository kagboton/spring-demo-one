package com.kagboton.springdemo;

public class TennisCoach implements Coach {
	
	// private fields for injection
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// create a no-arg constructor
	public TennisCoach(){
		System.out.println("Tennis coach :: inside the no-arg constructor");
	}
	
	// our setter methods
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Tennis coach :: inside the setter setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Tennis Coach - inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Tennis Coach - inside setter method - setTeam");
		this.team = team;
	}
	
	public String getEmailAddress() {		
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Share the ball with the wall";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Tennis coach: " + fortuneService.getFortune();
	}

}
