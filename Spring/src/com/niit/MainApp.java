package com.niit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
      @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
      HelloWorld obj = (HelloWorld) context.getBean("Welcome");
      obj.Call();
   }
}
