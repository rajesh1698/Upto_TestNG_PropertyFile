package com.TestNg_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Demo {
	
	@Test(retryAnalyzer = Rerun_Failed.class)
	private void credentials() {
		
		String actual ="tony Stark";
		String expected ="Tony Stark";
		Assert.assertEquals(actual, expected);

	}
	@Test(retryAnalyzer = Rerun_Failed.class)
	private void credentials1() {
		
		String actual_Username="TonyStark12";
		String expected_Username="Peter123";
		Assert.assertEquals(actual_Username, expected_Username);

	}
	
	
	

}
