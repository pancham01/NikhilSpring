package com.explore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.explore.model.Employee;

public class InnerMain {

	public static void main(String[] args) {
		
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("inner-bean.xml");
		Employee bean1 = (Employee) ioc.getBean("emp");

		System.out.println(bean1);
		
	}

}
