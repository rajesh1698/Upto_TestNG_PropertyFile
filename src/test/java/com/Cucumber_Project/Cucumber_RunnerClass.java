package com.Cucumber_Project;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.Base_Class;
import com.SDPs.Page_Object_Manager;

public class Cucumber_RunnerClass extends Base_Class{
	
	static Logger log = Logger.getLogger(Cucumber_RunnerClass.class);
	public static WebDriver driver = getBrowser("Chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
