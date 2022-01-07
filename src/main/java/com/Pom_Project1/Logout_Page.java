package com.Pom_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Log me out']")
	private WebElement Logout_Page;
	
	public Logout_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogout_Button() {
		return Logout_Page;
	}
}
