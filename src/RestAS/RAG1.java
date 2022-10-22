package RestAS;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RAG1 {
	public static void main(String[] args){
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification a=RestAssured.given();
	System.out.println(a);
	Response b=a.request(Method.GET,"api/unknown/2");
	System.out.println(b.asString());
	System.out.println(b.statusCode());
	System.out.println(b.statusLine());
	//System.out.println();

}
}


