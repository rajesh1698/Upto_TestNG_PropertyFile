package com.Api_Project;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json_Validation {
	
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\src\\test\\java\\com\\Payload_Api\\Payload.json");
		FileReader reader = new FileReader(f);
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject jsonobjt = (JSONObject) parse;
		Object object = jsonobjt.get("Name");
		String value = object.toString();
		System.out.println(value);
	}
}
