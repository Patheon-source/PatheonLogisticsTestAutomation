package stepdefinitions;

import static org.junit.Assert.*;

import org.slf4j.LoggerFactory;

import helpers.RestAssdReusableMethods;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.util.EnvironmentVariables;
import helpers.Utilities;

public class Order_API_POST_Operation_Definitions {

	private EnvironmentVariables environmentVariables;
	Response resp;
	String TestCaseNameWD;
	private String host;
	private String resourceURI;
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Order_API_POST_Operation_Definitions.class);

	@Before
	public String getHost() {
		host = environmentVariables.getProperty("OrderAPIQAHostURL");
		return host;
	}

	@Before
	public String getresourceURI() {
		resourceURI = environmentVariables.getProperty("OrderAPIQAResourceURI");
		return resourceURI;
	}

	@Given("User perform POST Operation for Validating Mandatory Fields - Test Case Name - {}")
	public void user_perform_POST_Operation_for_Validating_MandatoryFields(String TestCaseName) throws Throwable {
		LOGGER.info("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = TestCaseName.replace("\"", "");
		resp = (Response) RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message When Mandatory Fields missing in the Request")
	public void user_should_see_the_Response_Code_MandatoryFields(Integer ResponseCode) throws Exception {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		assertEquals(resp.getBody().jsonPath().get("ErrorResponse[0].resultMessage"),
				Utilities.getResultMessage(TestCaseNameWD));
	}

	@Given("User perform POST Operation for Validating Field Types - Test Case Name - {}")
	public void user_perform_POST_Operation_for_Validating_FieldType(String TestCaseName) throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = TestCaseName.replace("\"", "");
		resp = (Response) RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message When Field Type is Invalid")
	public void user_should_see_the_Response_Code_FieldType(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}

	@Given("User perform POST Operation for Validating Field Length - Test Case Name - {}")
	public void user_perform_POST_Operation_for_Validating_FieldLength(String TestCaseName) throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = TestCaseName.replace("\"", "");
		resp = (Response) RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message When Field Length is Invalid")
	public void user_should_see_the_Response_Code_FieldLength(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}

	@Given("User perform POST Operation for Validating Duplicate Order Number")
	public void user_perform_POST_Operation_for_Validating_DuplicateOrder() throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = "OrderApi_DuplicateOrderNumber_Validation";
		resp = (Response) RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message for Duplicate Order Number")
	public void user_should_see_the_Response_Code_DuplicateOrder(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}

	@Given("User perform POST Operation for Validating Maximum Product Line Items in an Order")
	public void user_perform_POST_Operation_for_Validating_MaxProducts() throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = "OrderApi_MaxProductLineItems_Validation";
		resp = (Response) RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message for Maximum Products")
	public void user_should_see_the_Response_Code_MaxProducts(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}
	
	@Given("User perform POST Operation for Validating Invalid SKU in an Order")
	public void user_perform_POST_Operation_for_Validating_Invalid_SKU() throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = "OrderApi_MultipleInvalidProducts_Validation";
		resp = (Response) RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message for Invalid SKU")
	public void user_should_see_the_Response_Code_InvalidSKU(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}
	
	@Given("User perform POST Operation for Validating Valid and Invalid SKU in an Order")
	public void user_perform_POST_Operation_for_Validating_Valid_Invalid_SKU() throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = "OrderApi_MultipleProductsWithValidAndInvalidSKU_Validation";
		resp = (Response) RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message for Valid and Invalid SKU")
	public void user_should_see_the_Response_Code_ValidAndInvalidSKU(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}
	
	@Given("User perform POST Operation for Successfull Order Creation")
	public void user_perform_POST_Operation_for_Validating_Successfull_Order() throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = "OrderApi_PlaceOrder_SuccessValidation";
		resp = (Response) RestAssdReusableMethods.PostOperationSuccess(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message When Order Created Successfully")
	public void user_should_see_the_Response_Code_Successfull_Order(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}
	
}
