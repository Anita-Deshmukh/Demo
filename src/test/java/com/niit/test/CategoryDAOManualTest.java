package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

public class CategoryDAOManualTest 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		CategoryDAO categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		Category category= new Category();
		category.setCategoryName("samsungmobile");
		category.setCategoryDesc("All smart moblies");
		categoryDAO.add(category);
		System.out.println("Category Inserted");
		
	}
}
