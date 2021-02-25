package com.kagboton.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String [] args){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        TrackCoach myCoach = context.getBean("myCoach", TrackCoach.class);

        // call methods
        System.out.println(myCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
