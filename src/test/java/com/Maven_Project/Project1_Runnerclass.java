 package com.Maven_Project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.SDPs.Page_Object_Manager;
import com.helper1.File_Reader_Manager1;

public class Project1_Runnerclass extends Base_Class {
	static Logger log = Logger.getLogger(Project1_Runnerclass.class);
	public static WebDriver driver = getBrowser("Chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		String url = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getUrl();
		url(url);
		sleep(3000);
	    log.info("url launch successfully");
	    clickOnElement(pom.getInstancehp().getsignIn_Button());
	    sleep(1000);
	    String emailId = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getemailId();
	    inputValueElement(pom.getInstancesB().getemailId(), emailId);
	    sleep(1000);
	    String passWord = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getpassWord();
	    inputValueElement(pom.getInstancesB().getpassWord(), passWord);
	    clickOnElement(pom.getInstancesB().getsignIn());
	    sleep(2000);
		clickOnElement(pom.getInstancewD().getwomen_Button());
		sleep(2000);
		log.info("Women Dress Page Clicked");
		scroll("scrollby","window.scrollBy(0,1000)", pom.getInstancewD().getwomen_Button());
		clickOnElement(pom.getInstancecd().getPrinted_Dress());
		scroll("scrollby","window.scrollBy(0,200)",pom.getInstancecd().getPrinted_Dress());
		log.info("Printed Dress Selected");
		clear(pom.getInstancepd().getquantity());
		String quantity = particular_Data("C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\Test Case 2.xlsx", 4 , 5);
		inputValueElement(pom.getInstancepd().getquantity(), quantity);
		String size = particular_Data("C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\Test Case 2.xlsx", 5, 5);
		dropDown("index", pom.getInstancepd().getdress_Size(), size);
		clickOnElement(pom.getInstancepd().getaddCart());
		sleep(2000);
		log.info("Quantity and Size added and clicked Add to Cart Button");
		clickOnElement(pom.getInstancepa().getproduct_Add());
		log.info("Clicked Proceed to Checkout Button");
		clickOnElement(pom.getInstanceco().getcheck_Out());
		log.info("Clicked Proceed to Order");
		clickOnElement(pom.getInstancepc().getproceed_Checkout());
		sleep(1000);
		clickOnElement(pom.getInstancesp().getagree_Button());
		clickOnElement(pom.getInstancesp().getproceed_Shipping());
		log.info("Clicked Agree Button and Proceed to Shipping");
		clickOnElement(pom.getInstancebp().getselect_Bank());
		clickOnElement(pom.getInstancecO().getconfirm_Order());
		log.info("Entered Bank Details and Confirm Order");
		log.info("Order Placed");
	}
}
