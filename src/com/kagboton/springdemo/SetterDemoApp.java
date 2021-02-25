package com.kagboton.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		TennisCoach myTennisCoach = context.getBean("myTennisCoach", TennisCoach.class);
		
		// call the methods on the bean
		System.out.println(myTennisCoach.getDailyWorkout());
		
		System.out.println(myTennisCoach.getDailyFortune());

		System.out.println(myTennisCoach.getEmailAddress());
		
		System.out.println(myTennisCoach.getTeam());
		
		// close the context
		context.close();
	}

}
