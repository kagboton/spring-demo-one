package com.kagboton.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.desktop.SystemEventListener;

public class BeanScopeDemoApp {

    public static void main(String [] args){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach myCoach = context.getBean("myCoach", Coach.class);

        Coach myCoachAgain = context.getBean("myCoach", Coach.class);

        // call methods

        System.out.println("The two object are equals ? " + (myCoach == myCoachAgain));

        System.out.println("My baseball coach 1 : " + myCoach);

        System.out.println("My baseball coach 2 : " + myCoachAgain);

        // close the context
        context.close();
    }
}
