package com.fdmgroup.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fdmgroup.service.Customer;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		//Customer customer = (Customer) context.getBean("customer");
		Customer c1 = context.getBean("customer", Customer.class);
		Customer c2 = context.getBean("customer1", Customer.class);
		Customer c3 = context.getBean("customer2", Customer.class);
		
		if (c1.equals(c2) && c2.equals(c3) && c1.equals(c3)){
			System.out.println("All customers are the same...");
		}
		else {
			System.out.println("Customers are different...");
		}
		
		System.out.println(c1);
	}
}
