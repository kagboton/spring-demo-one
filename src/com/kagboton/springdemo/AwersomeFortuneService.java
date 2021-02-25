package com.kagboton.springdemo;

import java.util.Random;

public class AwersomeFortuneService implements FortuneService {

	// private field for array of  fortunes
	private String fortunesArray [] = {"This is a awersome day", "This is a super awersome day", "This is a super mega awersome day"};
	
	@Override
	public String getFortune() {
		int randomIndex = new Random().nextInt(fortunesArray.length);
		return fortunesArray[randomIndex];
	}

}
