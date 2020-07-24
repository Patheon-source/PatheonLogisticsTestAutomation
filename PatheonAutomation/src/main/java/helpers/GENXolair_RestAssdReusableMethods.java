package helpers;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
public class GENXolair_RestAssdReusableMethods {

	public static ResponseOptions<Response> PostOperation(String TestCaseName, String host, String resourceURI) throws Exception
	{
			RestAssured.baseURI=host;
			Response res=given().contentType(ContentType.JSON).log().ifValidationFails().
					body(GENXolairjsonPayload.PlaceOrderPostDataJson(TestCaseName)).
					post(resourceURI);
			return res;
	}
	
	public static ResponseOptions<Response> PostOperationSuccess(String TestCaseName, String host, String resourceURI) throws Exception
	{
			RestAssured.baseURI=host;
			Response res=given().contentType(ContentType.JSON).log().ifValidationFails().
					body(GENXolairjsonPayload.PlaceOrderSuccessPostDataJson(TestCaseName)).
					post(resourceURI);
			return res;
	}
}
