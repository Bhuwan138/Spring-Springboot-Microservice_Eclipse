package com.bhuwan.beans;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Inject
	@Qualifier("java")
	public ICourseMaterial courseMaterial;
	
	public void prepareExam(String examName) {
		System.out.println("Student Prepration for exam of::" + examName);
		String courseContent = courseMaterial.courseContent();
		double price = courseMaterial.price();
		System.out.println("Prepration is going on using ::" + courseContent + " materials with price of  " + price);
		System.out.println("Prepration is completed for:: " + examName);
	}
}
