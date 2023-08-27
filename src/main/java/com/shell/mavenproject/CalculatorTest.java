package com.shell.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void AddTest1() {
		Calculator c = new Calculator();
		int expected = 10;
		int actual = c.add(5,5);
		assertEquals(actual,expected);
	}
	@Test
	public void AddTest2() {
		Calculator c = new Calculator();
		int expected = 10;
		int actual = c.add(3,7);
		assertEquals(actual,expected);
	}
}
