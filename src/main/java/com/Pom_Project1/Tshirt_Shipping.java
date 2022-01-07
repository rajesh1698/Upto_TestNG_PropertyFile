package com.Pom_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Shipping {
	public WebDriver driver;
	@FindBy(id = "cgv")
	private WebElement Terms_Agree;
	
	public WebElement getTerms_Agree() {
		return Terms_Agree;
	}
	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement Shipping_Checkout;
	
	public Tshirt_Shipping(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getShipping_Checkout() {
		return Shipping_Checkout;
	}

}
