package helpers;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
public class RestAssdReusableMethods {

	public static ResponseOptions<Response> PostOperation(String TestCaseName, String host, String resourceURI) throws Exception
	{
			RestAssured.baseURI=host;
			Response res=given().contentType(ContentType.JSON).log().ifValidationFails().
					body(jsonPayload.PlaceOrderPostDataJson(TestCaseName)).
					post(resourceURI);
			return res;
	}
	
	public static ResponseOptions<Response> PostOperationSuccess(String TestCaseName, String host, String resourceURI) throws Exception
	{
			RestAssured.baseURI=host;
			Response res=given().contentType(ContentType.JSON).log().ifValidationFails().
					body(jsonPayload.PlaceOrderSuccessPostDataJson(TestCaseName)).
					post(resourceURI);
			return res;
	}
}
