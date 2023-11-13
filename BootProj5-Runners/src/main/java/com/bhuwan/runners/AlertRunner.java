package com.bhuwan.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AlertRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("AlertRunner.run() using cmd line runner");
		for(String arg: args) {
			System.out.println(arg);
		}
	}
	

}
