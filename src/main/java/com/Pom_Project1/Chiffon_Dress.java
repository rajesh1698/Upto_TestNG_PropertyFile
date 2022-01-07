package com.Pom_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chiffon_Dress {
	public WebDriver driver;
	@FindBy(xpath = "(//a[@title='Printed Chiffon Dress'])[2]")
	private WebElement Chiffon_Dress;
	
	public Chiffon_Dress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getChiffon_Dress() {
		return Chiffon_Dress;
	}
	
	
	
	
	
	
	
	

}
