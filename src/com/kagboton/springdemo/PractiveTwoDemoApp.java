package com.kagboton.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PractiveTwoDemoApp {
	
	public static void main(String args[]) {
		
		// load the applicationContext.xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		TrackCoach myCoach = context.getBean("myTrackCoach", TrackCoach.class);
			
		// call methods
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
	
}
