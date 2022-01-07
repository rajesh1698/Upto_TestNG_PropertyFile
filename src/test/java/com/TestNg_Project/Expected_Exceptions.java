package com.TestNg_Project;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
		
		int age = 20;
		System.out.println(age/0);
	}
	

}
