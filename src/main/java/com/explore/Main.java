package com.explore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.explore.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		Employee bean = ioc.getBean(Employee.class ,"emp");
		System.out.println(bean);

		
	}

}
