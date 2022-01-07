package com.TestNg_Project;

import org.testng.annotations.Test;

public class Grouping_Features {
	
	@Test(groups = "JAVA OOPS")
	private void abstraction() {
		
		System.out.println("Abstaction");
	}
	@Test(groups = "JAVA OOPS")
	private void encapsulation() {
		
		System.out.println("Encapsulation");
	}
	@Test(groups = "JAVA OOPS")
	private void inheritance() {
		
		System.out.println("Inheritance");
	}
	@Test(groups = "JAVA OOPS")
	private void polymorphism() {
		
		System.out.println("Polymorphism");
	}
	@Test(groups = "Selenium")
	private void seleniumIde() {
		
		System.out.println("Selenium IDE");
	}
	@Test(groups = "Selenium")
	private void seleniumRc() {
		
		System.out.println("Selenium RC");
	}
	@Test(groups = "Selenium")
	private void webdriver() {
		
		System.out.println("Selenium WebDriver");
	}
	@Test(groups = "Selenium")
	private void seleniumGrid() {
		
		System.out.println("Selenium Grid");
	}

}
