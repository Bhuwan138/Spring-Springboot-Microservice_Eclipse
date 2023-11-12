// WishMessageGenerator.java
package com.bhuwan.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired // Field Level Injection
	private LocalDateTime date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}
	
	
	// Business method
	public String generateWishMessage(String userName) {
		System.out.println("WishMessageGenerator.generateWishMessage(-)");
		// Get current hours of a day
		int hours = date.getHour(); // get 24 hrs format from 0-23
		if(hours <= 12)
			return "Good Morning " + userName;
		else if(hours <= 16)
			return "Good Afternoon " + userName;
		else if(hours <= 20)
			return "Good Evening " + userName;
		else {
			return "Good Night " + userName;
		}
		
	}
	
	
}
