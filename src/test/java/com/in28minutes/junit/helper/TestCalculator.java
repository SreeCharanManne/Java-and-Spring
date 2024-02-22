package com.in28minutes.junit.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator c =null;
	CalculatorService service = mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		c = new Calculator(service);
	}

	@Test
	public void test() {
		when(service.add(2,3)).thenReturn(5);
		assertEquals(10,c.perform(2, 3));
	}

}
