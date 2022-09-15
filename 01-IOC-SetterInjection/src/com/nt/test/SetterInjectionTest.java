package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		//locate & hold spring bean configuration file from the system 
		FileSystemResource resource=new FileSystemResource("F:\\workspace\\framework\\springboot\\natraz_SPSBMS\\01-IOC-SetterInjection\\src\\com.nt.configurations\\applicationContext.xml");
//or		FileSystemResource resource=new FileSystemResource("F:/workspace/framework/springboot/natraz_SPSBMS/01-IOC-SetterInjection/src/com.nt.configurations/applicationContext.xml");
		//create/start IOC container 
		
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		//get target bean class object
	
		Object bean = factory.getBean("wmg");
		//typecast the object into target object
		
		WishMessageGenerator generator=(WishMessageGenerator)bean;
		String result=generator.generateWishMessage("ram");
		System.out.println("Result is="+result);
		
	}

}
