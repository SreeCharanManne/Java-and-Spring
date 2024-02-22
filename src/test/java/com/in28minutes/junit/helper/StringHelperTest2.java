package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTest2 {
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	
	
    public StringHelperTest2(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
    public static Collection<String[]> testcondition() {
    	String expectedoutput[][] = {{"AACD","CD"},
    	{"ABCD","BCD"}};
    	
    	return Arrays.asList(expectedoutput); //[[],[]]  
    	
    }
    
	@Test
	public void testtruncateAInFirst2Positions() {
//		System.out.println(expectedOutput);
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));	
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("CDCD"));
	}
	
	



}
