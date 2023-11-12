package com.bhuwan.beans;

import javax.inject.Named;

@Named("java")
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
