package com.bhuwan.beans;

import org.springframework.stereotype.Component;

@Component("angular")
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
