package com.explore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.explore.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		Employee bean1 = (Employee) ioc.getBean("emp");
		Employee bean2 = (Employee) ioc.getBean("emp");
		Employee bean3 = ioc.getBean("emp",Employee.class);
		Employee bean4 = ioc.getBean("emp",Employee.class);
//		Employee bean5 = (Employee) ioc.getBean("emp",2,"Dinesh","M");
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
		System.out.println(bean4);
//		System.out.println(bean5);

		
	}

}
