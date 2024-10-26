package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddtestassignmentApplicationTests {


	@Test
	void testAddEmptyString() {
		StringCaluclatorTest calculator =  new StringCaluclatorTest();
		int result = calculator.add("");
		Assertions.assertEquals(0,result ,"Adding an empty string should return 0");
		}
	
	@Test
	void testAddString() {
		StringCaluclatorTest calculator =  new StringCaluclatorTest();
		int result = calculator.add("1");
		Assertions.assertEquals(1,result,"Adding a single number should return the number itself");
	
		}
	
	@Test
	void testAddTwoNumbers()
	{
		StringCaluclatorTest calculator = new StringCaluclatorTest();
		int result = calculator.add("1,5");
		Assertions.assertEquals(6, result,"Adding two comma-separated numbers should return their sum");
	}
	
	@Test
	public void testAddMultipleNumbers() {
		StringCaluclatorTest calculator = new StringCaluclatorTest();
	    int result = calculator.add("1,2,3,4");
	    Assertions.assertEquals(10, result, "Adding multiple numbers should return their sum");
	}

	@Test
	public void testAddNumbersWithNewLines() {
		StringCaluclatorTest calculator = new StringCaluclatorTest();
	    int result = calculator.add("1\n2,3");
	    Assertions.assertEquals(6, result, "Adding numbers with new lines between them should return their sum");
	}

	@Test
	public void testAddWithCustomDelimiter() {
		StringCaluclatorTest calculator = new StringCaluclatorTest();
	    int result = calculator.add("//;\n1;2");
	    Assertions.assertEquals(3, result, "Using a custom delimiter should return the correct sum");
	}

}
