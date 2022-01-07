package com.Api_Project;

import org.junit.Assert;
import org.junit.Test;

import com.Maven_Project.Base_Class;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api_Demo extends Base_Class {
	
	@Test
	public void validate_Data() throws Throwable {
		
		String BaseURI = particular_Data("C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\TestNG_Excel_Data\\data.xlsx", 4, 1);
		RestAssured.baseURI = BaseURI;
		RequestSpecification request = RestAssured.given();
		String URL = particular_Data("C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\TestNG_Excel_Data\\data.xlsx", 5, 1);
		Response response = request.get(URL);
		String response_Body = response.asString();
		System.out.println(response_Body);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code :"+statusCode);
		String Code = particular_Data("C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\TestNG_Excel_Data\\data.xlsx", 6, 1);
		Assert.assertEquals(Code, statusCode);
		System.out.println("Data Validation Successful");

	}
}
