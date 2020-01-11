package com.deloitte;
import java.util.Scanner;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mobile {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		//Sim sim=(Sim).getBean("airtel");
		//Sim sim=new AirtelSim();
		Scanner in=new Scanner(System.in);
		new ClassPathXmlApplicationContext("spring.xml");
		String simname;
		System.out.println("insert a sim");
		simname=in.nextLine();
		Sim sim=(Sim) context.getBean(simname);
		
		sim.browse();
		sim.call();
		sim.sendSms();
	}

}
