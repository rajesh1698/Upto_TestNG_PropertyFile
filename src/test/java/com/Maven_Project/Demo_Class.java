package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Class {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Rajesh1603");
		Thread.sleep(3000);
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("Rajesh@5421");
		Thread.sleep(3000);
		
		WebElement logIn = driver.findElement(By.id("login"));
		logIn.click();
		Thread.sleep(3000);
	}

}
