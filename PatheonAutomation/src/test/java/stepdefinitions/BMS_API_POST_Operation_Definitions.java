package stepdefinitions;

import static org.junit.Assert.*;

import org.slf4j.LoggerFactory;

import helpers.BMS_RestAssdReusableMethods;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.util.EnvironmentVariables;
import helpers.BMS_Utilities;

public class BMS_API_POST_Operation_Definitions {

	private EnvironmentVariables environmentVariables;
	Response resp;
	String TestCaseNameWD;
	private String host;
	private String resourceURI;
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BMS_API_POST_Operation_Definitions.class);

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

	@Given("User perform POST Operation for Validating MandatoryFields - Test Case Name - {}")
	public void user_perform_POST_Operation_for_Validating_MandatoryFields(String TestCaseName) throws Throwable {
		LOGGER.info("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = TestCaseName.replace("\"", "");
		resp = (Response) BMS_RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, ResultCode and Appropriate Error Message When Mandatory Fields missing in the Request")
	public void user_should_see_the_Response_Code_MandatoryFields(Integer ResponseCode) throws Exception {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		assertEquals(resp.getBody().jsonPath().get("ErrorResponse[0].resultMessage"),
				BMS_Utilities.getResultMessage(TestCaseNameWD));
	}

	@Given("User perform POST Operation for Validating FieldTypes - Test Case Name - {}")
	public void user_perform_POST_Operation_for_Validating_FieldType(String TestCaseName) throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = TestCaseName.replace("\"", "");
		resp = (Response) BMS_RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, ResultCode and Appropriate Error Message When Field Type is Invalid")
	public void user_should_see_the_Response_Code_FieldType(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}

	@Given("User perform POST Operation for Validating FieldLength - Test Case Name - {}")
	public void user_perform_POST_Operation_for_Validating_FieldLength(String TestCaseName) throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = TestCaseName.replace("\"", "");
		resp = (Response) BMS_RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, ResultCode and Appropriate Error Message When Field Length is Invalid")
	public void user_should_see_the_Response_Code_FieldLength(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}

	@Given("User perform POST Operation for Validating Duplicate OrderNumber")
	public void user_perform_POST_Operation_for_Validating_DuplicateOrder() throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = "BMS_DuplicateOrderNumber_Validation";
		resp = (Response) BMS_RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, ResultCode and Appropriate Error Message for Duplicate Order Number")
	public void user_should_see_the_Response_Code_DuplicateOrder(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}
	
	@Given("User perform POST Operation for Validating Invalid SRF Image in an Order")
	public void user_perform_POST_Operation_for_Validating_Invalid_SRF_Image() throws Throwable {
		Actor.named("User").describedAs("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = "BMS_InvalidSRFImage_Validation";
		resp = (Response) BMS_RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message for Invalid SRF Image ")
	public void user_should_see_the_Response_Code_Invalid_SRF_Image(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}
	  
	@Then("User should see the Response Code {int}, Result Code and Appropriate Error Message for Invalid SRF Image")
	public void user_should_see_the_Response_Code_Result_Code_and_Appropriate_Error_Message_for_Invalid_SRF_Image(Integer ResponseCode) {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		System.out.println(ResponseCode.intValue());
	}

	  @Given("User perform POST Operation for Successfull BMS Order Creation") public
	  void user_perform_POST_Operation_for_Validating_Successfull_BMS_Order() throws
	  Throwable { Actor.named("User").describedAs("Sends POST Request To " +
	  getHost() + getresourceURI()); TestCaseNameWD =
	  "BMS_OrderApi_PlaceOrder_SuccessValidation"; resp = (Response)
	  BMS_RestAssdReusableMethods.PostOperationSuccess(TestCaseNameWD, getHost(),
	  getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, ResultCode and Appropriate Message When Order Created Successfully"
	  ) public void user_should_see_the_Response_Code_Successfull_BMS_Order(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	  
	  @Given("User perform POST Operation for Multiple products") public
	  void user_perform_POST_Operation_for_Validating_for_Multiple_Products() throws
	  Throwable { Actor.named("User").describedAs("Sends POST Request To " +
	  getHost() + getresourceURI()); TestCaseNameWD =
	  "BMS_OrderApi_PlaceOrderWithMultipleProducts_SuccessValidation"; resp = (Response)
	  BMS_RestAssdReusableMethods.PostOperationSuccess(TestCaseNameWD, getHost(),
	  getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, Result Code and Appropriate Message When Order Created Successfully for Multiple products"
	  ) public void user_should_see_the_Response_Code_for_Multiple_Products(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	 
	  @Given("User perform POST Operation for  Mandatory Fields Success Validation") public
	  void user_perform_POST_Operation_for_Validating_for_Mandatory_Fields() throws
	  Throwable { Actor.named("User").describedAs("Sends POST Request To " +
	  getHost() + getresourceURI()); TestCaseNameWD =
	  "BMS_OrderApi_PlaceOrderWithMandatoryFields_SuccessValidation"; resp = (Response)
	  BMS_RestAssdReusableMethods.PostOperationSuccess(TestCaseNameWD, getHost(),
	  getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, Result Code and Appropriate Message When Order Created Successfully for Mandatory Fields"
	  ) public void user_should_see_the_Response_Code_for_Mandatory_Fields(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	  
	  @Given("User perform POST Operation for  SourceCode Success Validation") public
	  void user_perform_POST_Operation_for_Validating_for_SourceCode() throws
	  Throwable { Actor.named("User").describedAs("Sends POST Request To " +
	  getHost() + getresourceURI()); TestCaseNameWD =
	  "BMS_OrderApi_PlaceOrder_SuccessValidation_SourceCode"; resp = (Response)
	  BMS_RestAssdReusableMethods.PostOperationSuccess(TestCaseNameWD, getHost(),
	  getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, Result Code and Appropriate Message When Order Created Successfully for SourceCode"
	  ) public void user_should_see_the_Response_Code_for_SourceCode(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	  
	  @Given("User perform POST Operation for  Without SourceCode Success Validation") public
	  void user_perform_POST_Operation_for_Validating_for_Without_SourceCode() throws
	  Throwable { Actor.named("User").describedAs("Sends POST Request To " +
	  getHost() + getresourceURI()); TestCaseNameWD =
	  "BMS_OrderApi_PlaceOrder_SuccessValidation_WithoutSourceCode"; resp = (Response)
	  BMS_RestAssdReusableMethods.PostOperationSuccess(TestCaseNameWD, getHost(),
	  getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, Result Code and Appropriate Message When Order Created Successfully for Without SourceCode"
	  ) public void user_should_see_the_Response_Code_for_Without_SourceCode(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	 
}
