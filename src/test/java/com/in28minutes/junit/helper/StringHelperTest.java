package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper helper;
	
	@Before
	public void loadbeforetest() {
		helper = new StringHelper();
	}

	@Test
	public void testtruncateAInFirst2Positions() {
		assertEquals("BCD",helper.truncateAInFirst2Positions("ABCD"));	
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@After
	public void aftertest() {
		System.out.println("Done with testing");
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testException() {
		int nums[]= null;
		Arrays.sort(nums);
	}
	
	@Test
	public void test_sortperformance() {
		int array[] = {12,3,4};
		for(int i=0;i<=1000000;i++) {
			array[0]=i;
			Arrays.sort(array);
		}
	}
	
	
	
	



}
