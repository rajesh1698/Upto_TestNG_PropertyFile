package com.TestNg_Project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	private void Demo_Username() {
		
		String actual_Username ="Rajesh12";
		String expected_Password ="Rajesh12";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual_Username, expected_Password);
		
		System.out.println("Username Validation was Successful");
		
	}

}
