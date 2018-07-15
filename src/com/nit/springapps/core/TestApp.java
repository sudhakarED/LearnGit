package com.nit.springapps.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");
		Vehicle v1 = (Vehicle) context1.getBean("v");
		System.out.println(v1.hashCode());

		Vehicle v2 = (Vehicle) context1.getBean("v");
		System.out.println(v2.hashCode());
	}
}
