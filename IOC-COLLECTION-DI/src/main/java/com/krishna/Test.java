package com.krishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("/spring.xml");

		Demo d = (Demo) ac.getBean("c");

		d.show();

	}

}
