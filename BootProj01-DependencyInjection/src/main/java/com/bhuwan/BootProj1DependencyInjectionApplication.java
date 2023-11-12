package com.bhuwan;

import java.io.PrintStream;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.bhuwan.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj1DependencyInjectionApplication {

	@Bean("ltd")
	public LocalDateTime createLocalDateTime() {
		System.out.println("BootProj1DependencyInjectionApplication.createLocalDateTime(-)");
		LocalDateTime ltdDateTime = LocalDateTime.now();
		return ltdDateTime;
	}
	
	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx =  SpringApplication.run(BootProj1DependencyInjectionApplication.class, args);
		
		// get Target spring bean class from IOC container
		WishMessageGenerator wishMessageGenerator  = ctx.getBean("wmg",WishMessageGenerator.class);	
		// invoke methods
		String resultString = wishMessageGenerator.generateWishMessage("Bhuwan");
		
		System.out.println(resultString);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
