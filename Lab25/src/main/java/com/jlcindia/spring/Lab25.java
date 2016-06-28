package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab25 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("****** contianer is ready*****");
		Hello h=(Hello)ctx.getBean("hello");
		h.show();
	}
}
