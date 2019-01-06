package com.lambdaexample.forcollectiontypeiterationtest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.lambdaexample.forcollectiontypeiterationtest.model.Product;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LambdaExampleCollectionIterationTest {
	
	private ArrayList<Product> products = new ArrayList<>();
	
	
	public ArrayList<Product> setProductsList(ArrayList<Product> products)
	{
		Product p1=new Product(101, "prod1", 47);
		Product p2=new Product(102, "prod2", 20);
		Product p3=new Product(103, "prod3", 15);
		Product p4=new Product(104, "prod4", 89);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		return products;
	}
	
	@Test
	public void test_01_assertTrue()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_02_TestForTheProductList()
	{
		products = setProductsList(products);
		assertNotNull(products);
		assertTrue(products.size()>0);
	}
	
	@Test
	public void test_03_IteratingOverTheList()
	{
		products = setProductsList(products);
		assertNotNull(products);
		assertTrue(products.size()>0);
		System.out.println("------------ This is by the Normal Lambda Expression Way ------------------");
		products.forEach(p -> System.out.println(p));
		LambdaExampleCollectionIterationTest lambdaExampleCollectionIterationTest = new LambdaExampleCollectionIterationTest();
		Collections.sort(products,lambdaExampleCollectionIterationTest::compare);
		System.out.println("------------- This is by the MethodReference way --------------------");
		products.forEach(System.out::println);
	}
	
	public int compare(Product a, Product b)
	{
		if(a.getProdPrice()<b.getProdPrice())
			return -1;
		else
			return 1;
	}
}
