package com.explore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.explore.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ioc = new AnnotationConfigApplicationContext("com.explore");
			Employee bean = ioc.getBean(Employee.class);
			System.out.println(bean);
		
	}

}
