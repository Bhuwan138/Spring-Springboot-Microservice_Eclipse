package com.bhuwan.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterialImpl implements ICourseMaterial {

	@Override
	public String courseContent() {
		return "1. OOP in java, 2. Exception Handling, 3. Collections";
	}

	@Override
	public double price() {
		return 500;
	}

}
