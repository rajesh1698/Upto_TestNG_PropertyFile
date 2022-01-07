package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner_Class extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = getBrowser("chrome");

		url("http://adactinhotelapp.com/");

		WebElement userName = driver.findElement(By.id("username"));
		inputValueElement(userName, "Rajesh1603");

		WebElement passWord = driver.findElement(By.id("password"));
		inputValueElement(passWord, "Rajesh@5421");

		WebElement logIn = driver.findElement(By.id("login"));
		clickOnElement(logIn);
		sleep(3000);

		WebElement location = driver.findElement(By.id("location"));
		dropDown("index", location, "5");

		WebElement hotels = driver.findElement(By.id("hotels"));
		dropDown("index",hotels,"2");

		WebElement type = driver.findElement(By.id("room_type"));
		dropDown("text",type, "Deluxe");

		WebElement nos = driver.findElement(By.id("room_nos"));
		dropDown("value",nos, "3");

		WebElement dateIn = driver.findElement(By.id("datepick_in"));
		clear(dateIn);
		inputValueElement(dateIn, "27/11/2021");

		WebElement dateOut = driver.findElement(By.id("datepick_out"));
		clear(dateOut);
		inputValueElement(dateOut, "30/11/2021");

		WebElement adult = driver.findElement(By.id("adult_room"));
		dropDown("value",adult, "4");

		WebElement child = driver.findElement(By.id("child_room"));
		dropDown("value",child, "2");

		WebElement search = driver.findElement(By.id("Submit"));
		clickOnElement(search);
		sleep(3000);

		WebElement roomButton = driver.findElement(By.id("radiobutton_0"));
		clickOnElement(roomButton);

		WebElement continue_Button = driver.findElement(By.id("continue"));
		clickOnElement(continue_Button);
		sleep(3000);

		scroll("scrollby","window.scrollBy(0,800)",continue_Button);

		WebElement fName = driver.findElement(By.id("first_name"));
		inputValueElement(fName, "Rajesh");

		WebElement lName = driver.findElement(By.id("last_name"));
		inputValueElement(lName, "V");

		WebElement address = driver.findElement(By.id("address"));
		inputValueElement(address, "No:2 London Small Street, London Main Road , London");

		WebElement cardNo = driver.findElement(By.id("cc_num"));
		inputValueElement(cardNo, "4824284244448414");

		WebElement cardType = driver.findElement(By.id("cc_type"));
		dropDown("text",cardType, "Master Card");

		WebElement expireMonth = driver.findElement(By.id("cc_exp_month"));
		dropDown("index",expireMonth, "5");

		WebElement expireYear = driver.findElement(By.id("cc_exp_year"));
		dropDown("value",expireYear, "2022");

		WebElement cardCvv = driver.findElement(By.id("cc_cvv"));
		inputValueElement(cardCvv, "544");

		WebElement bookNow = driver.findElement(By.id("book_now"));
		clickOnElement(bookNow);
		sleep(2000);

		quit();
	}

}
