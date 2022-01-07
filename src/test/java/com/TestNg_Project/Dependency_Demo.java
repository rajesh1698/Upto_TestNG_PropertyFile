package com.TestNg_Project;

import org.testng.annotations.Test;

public class Dependency_Demo {
	
	@Test(priority = -1)
	private void Mobile() {
		
		System.out.println("Mobile");

	}
	@Test(dependsOnMethods = "Mobile")
	private void Offer() {
	     
		System.out.println("Offer");
	}
	@Test(priority = 1)
	private void Watch() {
		
		System.out.println("Watch");

	}

}
