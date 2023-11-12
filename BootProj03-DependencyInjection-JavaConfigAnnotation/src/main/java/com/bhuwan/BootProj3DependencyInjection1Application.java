package com.bhuwan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhuwan.beans.Student;

@SpringBootApplication
public class BootProj3DependencyInjection1Application {

	public static void main(String[] args) {
		//get ioc container
		ApplicationContext  ctx =  SpringApplication.run(BootProj3DependencyInjection1Application.class, args);
		Student student = ctx.getBean("student",Student.class);
		student.prepareExam("Java");
	}

}
