package Rst;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Rest1 {
	public static void main(String[] args)
	{RequestSpecBuilder req_bui=new RequestSpecBuilder();
	RequestSpecification req = req_bui.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
	given().spec(req).when().get("/api/users/2").then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
	System.out.println("done");
	
	
	}
	

}
