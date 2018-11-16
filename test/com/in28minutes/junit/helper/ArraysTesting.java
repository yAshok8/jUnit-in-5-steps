package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTesting {

	@Test
	public void testArraySort_RandomArray() {
		int [] numbers = {41,5,3,4,13};
		int [] expected = {3,4,5,13,41};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray(){
		int [] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test
	public void testArraySort_EmptyArray() {
		int [] numbers = {};
		int [] expected = {};
		assertArrayEquals(expected, numbers);
	}
	
	@Test(timeout=100)
	public void testPerformance() {
		int array[] = {12,23,4};
		for (int i = 0; i < 100000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
