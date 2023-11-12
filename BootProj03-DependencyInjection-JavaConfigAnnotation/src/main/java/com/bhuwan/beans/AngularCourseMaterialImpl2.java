package com.bhuwan.beans;

import javax.inject.Named;

@Named("angular")
public class AngularCourseMaterialImpl2 implements ICourseMaterial {

	@Override
	public String courseContent() {
		return "1. TypeScript, 2. Templates, 3. Pipes";
	}

	@Override
	public double price() {
		return 450;
	}

}
