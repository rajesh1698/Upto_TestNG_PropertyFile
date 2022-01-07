package com.TestNg_Project;

import org.testng.annotations.Test;

public class Timeout_Test {
	
	@Test(timeOut = 7000)
	private void Amazon() throws Throwable {
		
		System.out.println("Browser Lanuch");
		Thread.sleep(2000);
		
		System.out.println("SignIN Account");
		Thread.sleep(2000);
		
		System.out.println("Credentials");
		Thread.sleep(3000);
		
		System.out.println("Logout Account");
		Thread.sleep(1000);

	}

}
