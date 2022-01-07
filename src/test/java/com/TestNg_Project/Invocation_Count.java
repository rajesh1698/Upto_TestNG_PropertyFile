package com.TestNg_Project;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority = -1)
	private void browserlaunch() {
		
		System.out.println("Browser Launch");
	}
	@Test(priority = 0)
	private void url() {
		
		System.out.println("URL");
	}
	@Test(priority = 1,invocationCount = 3)
	private void refresh() {
		
		System.out.println("Refresh");
	}

}
