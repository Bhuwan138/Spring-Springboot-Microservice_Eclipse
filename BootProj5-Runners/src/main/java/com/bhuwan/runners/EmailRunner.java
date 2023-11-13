package com.bhuwan.runners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("EmailRunner.run() using application runnners");
		System.out.println("Nonoptions args:: " + args.getNonOptionArgs()); // only value no keys
		System.out.println("Options args names/values:: " + args.getNonOptionArgs()); // contains --key=value, this method gives only keys
		System.out.println("Source args:: " + Arrays.toString(args.getSourceArgs())); 
		
		
	}

}
