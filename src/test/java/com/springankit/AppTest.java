package com.springankit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

 
public class AppTest {
	
public static void main(String[] args) {
	ApplicationContext context = new FileSystemXmlApplicationContext("config.xml");;
    Student s = (Student) context.getBean("student1");
    System.out.print(s);
    
           
}
}
