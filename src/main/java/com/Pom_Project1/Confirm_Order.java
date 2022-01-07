package com.Pom_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order {
	public WebDriver driver;
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement confirm_Order;
	
	public Confirm_Order(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getconfirm_Order() {
		return confirm_Order;
	}

}
