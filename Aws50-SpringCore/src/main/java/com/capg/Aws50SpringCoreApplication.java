package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Aws50SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Aws50SpringCoreApplication.class, args);
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringIoc.xml");
		Vehicle obj=(Vehicle)context.getBean("vehicle");
		obj.drive();
		System.out.println("hello");
		
		//Car c=new Car();
		//c.drive();
	}

}
