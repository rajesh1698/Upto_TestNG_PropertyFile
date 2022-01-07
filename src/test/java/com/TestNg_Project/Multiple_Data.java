package com.TestNg_Project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_Data {
	
	@Test(dataProvider = "testdata")
	private void data(String username, int password) {
		
		System.out.println("Username :"+username);
		
		System.out.println("Password :"+password);

	}
	@DataProvider
	private Object[][] testdata() {
		
		return new Object[][] {
		{"Tony Stark", 40},
		{"Peter parker", 25}

	};
	}
}
