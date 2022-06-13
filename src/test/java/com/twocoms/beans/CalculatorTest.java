package com.twocoms.beans;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc;
	
	@Before
	public void init()
	{
		calc = new Calculator();
	}
	
	@After
	public void cleanup()
	{
		calc = null;
	}

	@Test
	public void testAdd() {

		int actual = calc.add(5, 10);
		int expected = 15;
		assertEquals(expected, actual);

	}

	@Test
	public void testMultiple() {
		
		int actual = calc.multiple(5, 10);
		int expected = 50;
		assertEquals(expected, actual);

	}

}
