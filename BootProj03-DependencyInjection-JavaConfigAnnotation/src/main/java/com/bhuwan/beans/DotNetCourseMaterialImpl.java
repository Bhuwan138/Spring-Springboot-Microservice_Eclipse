package com.bhuwan.beans;

import javax.inject.Named;

@Named("dotNet")
public class DotNetCourseMaterialImpl implements ICourseMaterial {

	@Override
	public String courseContent() {
		return "1. OOP in C#, 2. Exception Handling, 3. Collections";
	}

	@Override
	public double price() {
		return 400;
	}

}
