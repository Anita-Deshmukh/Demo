package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.dao.CategoryDAO;
import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

public class SupplierDAOManualTest 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		SupplierDAO supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		Supplier supplier= new Supplier();
		supplier.setSupplierName("Pooja Desai");
		supplier.setAddress("Pune");
		supplierDAO.add(supplier);
		System.out.println("Supplier Inserted");
		
	}

}
