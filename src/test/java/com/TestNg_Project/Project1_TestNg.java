package com.TestNg_Project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Maven_Project.Base_Class;
import com.Maven_Project.Project1_Runnerclass;
import com.SDPs.Page_Object_Manager;
import com.helper1.File_Reader_Manager1;
      
public class Project1_TestNg extends Base_Class{
	static Logger log = Logger.getLogger(Project1_Runnerclass.class);
	public static WebDriver driver = getBrowser("Chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	    @BeforeClass
		private void Url_Launch() throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		String url = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getUrl();
		url(url);
	    log.info("url launch successfully");
	    }
	    @BeforeMethod
	    private void SignIn() throws Throwable {
	    clickOnElement(pom.getInstancehp().getsignIn_Button());
	    String emailId = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getemailId();
	    inputValueElement(pom.getInstancesB().getemailId(), emailId);
	    String passWord = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getpassWord();
	    inputValueElement(pom.getInstancesB().getpassWord(), passWord);
	    clickOnElement(pom.getInstancesB().getsignIn());
	    log.info("SignIN Successfully");
	    }
	    @Test(priority = -1,timeOut = 50000)
	    private void WomenDress() throws Throwable {
		clickOnElement(pom.getInstancewD().getwomen_Button());
		log.info("Women Page Clicked");
		clickOnElement(pom.getInstancecd().getPrinted_Dress());
		scroll("scrollby","window.scrollBy(0,200)",pom.getInstancecd().getPrinted_Dress());
		clear(pom.getInstancepd().getquantity());
		String quantity = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getQuantity();
		inputValueElement(pom.getInstancepd().getquantity(), quantity);
		String size = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getSize();
		dropDown("index", pom.getInstancepd().getdress_Size(), size);
		clickOnElement(pom.getInstancepd().getaddCart());
		explictwait(3000,"visibleofelement",pom.getInstancepa().getproduct_Add() );
		clickOnElement(pom.getInstancepa().getproduct_Add());
		clickOnElement(pom.getInstanceco().getcheck_Out());
		clickOnElement(pom.getInstancepc().getproceed_Checkout());
		clickOnElement(pom.getInstancesp().getagree_Button());
		clickOnElement(pom.getInstancesp().getproceed_Shipping());
		clickOnElement(pom.getInstancebp().getselect_Bank());
		clickOnElement(pom.getInstancecO().getconfirm_Order());
		log.info("Printed Dress Order Placed");
	    }
	    @Test(priority = 0,timeOut = 50000)
	    private void DressPage() throws Throwable {
	    clickOnElement(pom.getInstancedP().getDresses_Button());
	    log.info("Dress page Clicked");
	    clickOnElement(pom.getInstancecD().getChiffon_Dress());
	    String quantity1 = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getQuantity1();
	    inputValueElement(pom.getInstancecA().getChiffon_Quantity(), quantity1);
	    String size1 = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getSize1();
	    inputValueElement(pom.getInstancecA().getChiffon_Size(), size1);
	    clickOnElement(pom.getInstancecA().getChiffon_AddtoCart());
	    explictwait(2000,"visibleofelement",pom.getInstancepC().getCheckout1());
	    clickOnElement(pom.getInstancepC().getCheckout1());
	    clickOnElement(pom.getInstancecc().getCheckout2());
	    clickOnElement(pom.getInstanceaC().getCheckout3());
	    clickOnElement(pom.getInstancesC().getTerms_Agree());
	    clickOnElement(pom.getInstancesC().getCheckout4());
	    clickOnElement(pom.getInstancecB().getBank_Option());
	    clickOnElement(pom.getInstanceCo().getOrder_Confirm());
	    log.info("Chiffon Dress Order Placed");
	    }
	    @Test(priority = 1,timeOut = 50000)
	    private void TShirts() throws Throwable {
	    clickOnElement(pom.getInstancetP().getTshirt());
	    log.info("Tshirt Page Clicked");
	    clickOnElement(pom.getInstancest().getSleeve_Tshirt());
	    String quantity2 = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getQuantity2();
	    inputValueElement(pom.getInstancetC().getTshirt_Quantity(), quantity2);
	    String size2 = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getSize2();
	    inputValueElement(pom.getInstancetC().getTshirt_Size(), size2);
	    clickOnElement(pom.getInstancetC().getTshirt_AddtoCart());
	    explictwait(2000,"visibleofelement",pom.getInstanceSc().getSleeve_Checkout());
	    clickOnElement(pom.getInstanceSc().getSleeve_Checkout());
	    clickOnElement(pom.getInstanceTc().getTshirt_Checkout());
	    clickOnElement(pom.getInstanceTa().getAddress_Checkout());
	    clickOnElement(pom.getInstanceTs().getTerms_Agree());
	    clickOnElement(pom.getInstanceTs().getShipping_Checkout());
	    clickOnElement(pom.getInstanceTp().getTshirt_Payment());
	    clickOnElement(pom.getInstanceTo().getOrder_Confirm());
	    log.info("Sleeve Tshirt Order Placed");
	    }
		@AfterMethod
		private void Logout() {
		clickOnElement(pom.getInstancelP().getLogout_Button());
		log.info("LogOut Successfully");
	    }
		@AfterClass
		private void Close() {
			quit();
			log.info("Browser Closed");
		}
	}

