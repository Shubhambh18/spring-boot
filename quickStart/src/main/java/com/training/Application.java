package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext superType which is a beanFactory
		// AnnotationConfigApplicationContext SubType which is a IOC Container
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Doctor ram = (Doctor)ctx.getBean("doctor");				
//		System.out.println(ram);
//		
//		System.out.println(ram.getAddress());
//
////		System.out.println(ram.hashCode());
//		Doctor shyam = (Doctor)ctx.getBean("surgeon");
////		System.out.println(shyam.hashCode());	
////		Doctor shyamlal = (Doctor)ctx.getBean("surgeon");
////		System.out.println(shyamlal);
////		System.out.println(shyamlal.hashCode());
//		
//		
		
		 ((AbstractApplicationContext) ctx).close();

	}

}
