package com.TestNg_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {

	@Test
	private void Demo_Username() {
		
		String actual_Username ="rajesh12";
		String expected_Username ="Rajesh12";
		Assert.assertNotEquals(actual_Username, expected_Username);
		System.out.println("Mismatch Occur");
		
		String actual_Username1 ="Rajesh12";
		String expected_Username1 ="Rajesh12";
		Assert.assertEquals(actual_Username1, expected_Username1);
		System.out.println("Username validation successful");

	}
	@Test(priority = 1)
	private void Demo_Password() {
		
		String expected_Password="Rajesh@123";
		String actual_Password="Rajesh@123";
		Assert.assertEquals(actual_Password, expected_Password);
		System.out.println("Password validation successful");

	}
	
	
	
	
	

}
