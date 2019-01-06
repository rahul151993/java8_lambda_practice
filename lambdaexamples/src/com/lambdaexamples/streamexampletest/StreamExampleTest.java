package com.lambdaexamples.streamexampletest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.lambdaexample.forcollectiontypeiterationtest.model.Product;

public class StreamExampleTest {
	
	
	private ArrayList<Product> products = new ArrayList<>();
			
	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_StreamExampleNotNull()
	{
		 products = setupProductList(products);
		 assertNotNull(products);
		 assertTrue(products.size()>0);
	}
	
	
	@Test
	public void test_03_StreamExampleCase1()
	{
		
		products = setupProductList(products);
		products.stream().filter(p -> p.getProdName().startsWith("c")).forEach(System.out::println);
		
		System.out.println("The ID of the first product from the product list is = "+products.stream().findFirst().get().getProdId());
		
		
		StreamExampleTest streamExampleTest = new StreamExampleTest();
		products.parallelStream().sorted((p1,p2) -> p1.getProdName().compareTo(p2.getProdName())).forEach(System.out::println);
	}

	private ArrayList<Product> setupProductList(ArrayList<Product> products2) {
		products2.add(new Product(102, "pro3", 27));
		products2.add(new Product(103, "pro1", 72));
		products2.add(new Product(101, "cro2", 100));
		return products2;
	}
}
