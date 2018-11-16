package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_NoAinFirstTwoPosition() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinLastTwoPosition() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_OnlyTwoCharacters() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("KL"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_OnlyOneChar() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("X"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_NullInput() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(null));
	}

}
