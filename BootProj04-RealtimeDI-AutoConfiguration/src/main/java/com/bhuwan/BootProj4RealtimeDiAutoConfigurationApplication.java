package com.bhuwan;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.bhuwan.controller.MainController;
import com.bhuwan.vo.EmployeeVO;

@SpringBootApplication
public class BootProj4RealtimeDiAutoConfigurationApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Desgs count::");
		int count=sc.nextInt();
		String desgs[]=null;
		if(count>=1)
		    desgs=new String[count];
		else {
			System.out.println("invalid desg count ");
			return;
		}
		for(int i=0;i<count;++i) {
			System.out.println("enter desg"+(i+1));
			String desg=sc.next();
			desgs[i]=desg.toUpperCase();
		}
		ApplicationContext ctx = SpringApplication.run(BootProj4RealtimeDiAutoConfigurationApplication.class, args);
		MainController controller = ctx.getBean("controller",MainController.class);
		try {
		List<EmployeeVO> voList = controller.showEmpsByDesgs(desgs);
		System.out.println("Emp details having "+Arrays.toString(desgs));
		voList.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some Internal problem::"+e.getMessage());
		}
		// close IOC container
		((ConfigurableApplicationContext) ctx).close();
	}// main
}// class
