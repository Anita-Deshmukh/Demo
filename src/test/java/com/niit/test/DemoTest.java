package com.niit.test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class DemoTest 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		//context.refresh();
		
	}
}