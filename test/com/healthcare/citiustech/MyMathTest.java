package com.healthcare.citiustech;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
 
public class MyMathTest {

	MyMath math = new MyMath();
	
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClassTest() {
		System.out.println("After Class");
	}

	@Before
	public void beforeTest() {
		System.out.println("Before");
	}
	
	@After
	public void afterTest() {
		System.out.println("After");
	}
	
	@Test
	public void sum_With3numbers() {
		System.out.println("Test 1");
		assertEquals(6, math.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sumWith1Number() {
		System.out.println("Test 2");
		assertEquals(13, math.sum(new int[] {13}));		
	}

}
