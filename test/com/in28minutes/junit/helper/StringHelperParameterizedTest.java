package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith; 
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	
	private String input;
	private String expected;

	public StringHelperParameterizedTest(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<String[]> parameterSupplier() {
		String parameters[][] = {
				{"AACD", "CD"},
				{"ACD", "CD"},
				{"JK", "JK"},
				{"AAACD", "ACD"}
		};
		return Arrays.asList(parameters);
	}
	
	@Test
	public void testTruncateAInFirst2Positions_testDifferentInputPairs() {
		assertEquals(expected, helper.truncateAInFirst2Positions(input));
	}
}
