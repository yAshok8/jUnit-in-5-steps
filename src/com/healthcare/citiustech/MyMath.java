package com.healthcare.citiustech;

public class MyMath {

	public int sum(int [] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}
}
