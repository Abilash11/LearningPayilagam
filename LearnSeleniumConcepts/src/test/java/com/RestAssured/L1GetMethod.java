package com.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class L1GetMethod {
	

	@Test
	public void getAllStore(){
		RestAssured.baseURI = "https://petstore.swagger.io/";
		
    RequestSpecification requestspecification = RestAssured.given();
   Response response = requestspecification.request(Method.GET,"store/getInventory"); 
       System.out.println(response.asPrettyString()); 
       System.out.println(response.asPrettyString()); 
		
		
	}
	
	

}
