package com.example.demo;

public class StringCaluclatorTest {

	public static int add (String number)
	{
		if (number.isEmpty())
		{
			return 0;
		}
		
		String delimiter = ",|\n";
	    if (number.startsWith("//")) {
	        int delimiterIndex = number.indexOf("\n");
	        delimiter = number.substring(2, delimiterIndex);
	        number = number.substring(delimiterIndex + 1);
	    }

	    String[] numArray = number.split(delimiter);
	    int sum = 0;
	    for (String num : numArray) {
	        sum += Integer.parseInt(num);
	    }
	    return sum;
	}
}