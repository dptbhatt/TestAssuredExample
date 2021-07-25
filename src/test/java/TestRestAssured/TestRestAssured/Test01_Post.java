package TestRestAssured.TestRestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Test01_Post {
	
	@Test()
	void test01() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		
		 int statuscode = response.getStatusCode(); 
		 Assert.assertEquals(statuscode, 200);
		 System.out.println("done");
		 
		
		
	}

}
