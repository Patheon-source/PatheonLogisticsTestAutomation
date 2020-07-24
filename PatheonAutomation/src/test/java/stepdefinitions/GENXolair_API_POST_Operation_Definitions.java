package stepdefinitions;

import static org.junit.Assert.*;

import org.slf4j.LoggerFactory;

import helpers.GENXolair_RestAssdReusableMethods;
import helpers.GENXolair_Utilities;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.util.EnvironmentVariables;
import helpers.BMS_RestAssdReusableMethods;
import helpers.BMS_Utilities;
import helpers.GENXolair_RestAssdReusableMethods;

public class GENXolair_API_POST_Operation_Definitions {

	private EnvironmentVariables environmentVariables;
	Response resp;
	String TestCaseNameWD;
	private String host;
	private String resourceURI;
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(GENXolair_API_POST_Operation_Definitions.class);

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

	@Given("User perform POST Operation for Validating GEN Xolair MandatoryFields - Test Case Name - {}")
	public void user_perform_POST_Operation_for_Validating_GEN_Xolair_MandatoryFields(String TestCaseName) throws Throwable {
		LOGGER.info("Sends POST Request To " + getHost() + getresourceURI());
		TestCaseNameWD = TestCaseName.replace("\"", "");
		resp = (Response) GENXolair_RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(), getresourceURI());
	}

	@Then("User should see the Response Code {int}, ResultCode and Appropriate Error Message When GEN Xolair Mandatory Fields missing in the Request")
	public void user_should_see_the_Response_Code_MandatoryFields(Integer ResponseCode) throws Exception {
		int ActualrespCode = resp.getStatusCode();
		assertEquals(ActualrespCode, ResponseCode.intValue());
		assertEquals(resp.getBody().jsonPath().get("ErrorResponse[0].resultMessage"),
				GENXolair_Utilities.getResultMessage(TestCaseNameWD));
	}

	
	  @Given("User perform POST Operation for Validating GEN Xolair FieldTypes - Test Case Name - {}"
	  ) public void user_perform_POST_Operation_for_Validating_GEN_Xolair_FieldType(String
	  TestCaseName) throws Throwable {
	  Actor.named("User").describedAs("Sends POST Request To " + getHost() +
	  getresourceURI()); TestCaseNameWD = TestCaseName.replace("\"", ""); resp =
	  (Response) GENXolair_RestAssdReusableMethods.PostOperation(TestCaseNameWD,
	  getHost(), getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, ResultCode and Appropriate Error Message When GEN Xolair Field Type is Invalid"
	  ) public void user_should_see_the_Response_Code_GEN_Xolair_FieldType(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	  
	  @Given("User perform POST Operation for Validating GEN Xolair FieldLength - Test Case Name - {}"
	  ) public void user_perform_POST_Operation_for_Validating_GEN_Xolair_FieldLength(String
	  TestCaseName) throws Throwable {
	  Actor.named("User").describedAs("Sends POST Request To " + getHost() +
	  getresourceURI()); TestCaseNameWD = TestCaseName.replace("\"", ""); resp =
	  (Response) GENXolair_RestAssdReusableMethods.PostOperation(TestCaseNameWD,
	  getHost(), getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, ResultCode and Appropriate Error Message When GEN Xolair Field Length is Invalid"
	  ) public void user_should_see_the_Response_Code_GEN_Xolair_FieldLength(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	 

	
	  @Given("User perform POST Operation for Validating GEN Xolair Duplicate OrderNumber")
	  public void user_perform_POST_Operation_for_Validating_GEN_Xolair_DuplicateOrder()
	  throws Throwable { Actor.named("User").describedAs("Sends POST Request To " +
	  getHost() + getresourceURI()); TestCaseNameWD =
	  "GENXolair_OrderAPI_DuplicateOrderNumber_Validation"; resp = (Response)
	  GENXolair_RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(),
	  getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, ResultCode and Appropriate Error Message for GEN Xolair Duplicate Order Number"
	  ) public void user_should_see_the_Response_Code_GEN_Xolair_DuplicateOrder(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	 
	
	
	  @Given("User perform POST Operation for Validating GEN Xolair Invalid SRF Image"
	  ) public void user_perform_POST_Operation_for_Validating_GEN_Xolair_Invalid_SRF_Image()
	  throws Throwable { Actor.named("User").describedAs("Sends POST Request To " +
	  getHost() + getresourceURI()); TestCaseNameWD =
	  "GENXolair_OrderAPI_InvalidSRFImage_Validation"; resp = (Response)
	  GENXolair_RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(),
	  getresourceURI()); }
	  
	  
	  @Then("User should see the Response Code {int}, Result Code and Appropriate Error Message for GEN Xolair Invalid SRF Image"
	  ) public void
	  user_should_see_the_Response_Code_Result_Code_and_Appropriate_Error_Message_for_GEN_Xolair_Invalid_SRF_Image
	  (Integer ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	  
	  @Given("User perform POST Operation for Validating GEN Xolair Combined with both Products")
	  public void user_perform_POST_Operation_for_Validating_GEN_Xolair_Combined_Products()
	  throws Throwable { Actor.named("User").describedAs("Sends POST Request To " +
	  getHost() + getresourceURI()); TestCaseNameWD =
	  "GENXolair_OrderApi_combine_with_both_products"; resp = (Response)
	  GENXolair_RestAssdReusableMethods.PostOperation(TestCaseNameWD, getHost(),
	  getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, ResultCode and Appropriate Error Message for GEN Xolair Combined with both products"
	  ) public void user_should_see_the_Response_Code_GEN_Xolair_Combined_Products(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	 
	  @Given("User perform POST Operation for Successfull Order Creation for GEN Xolair") public
	  void user_perform_POST_Operation_for_Validating_Successfull_GEN_Xolair_Order() throws
	  Throwable { Actor.named("User").describedAs("Sends POST Request To " +
	  getHost() + getresourceURI()); TestCaseNameWD =
	  "GENXolair_OrderAPI_PlaceOrder_SuccessValidation"; resp = (Response)
	  GENXolair_RestAssdReusableMethods.PostOperationSuccess(TestCaseNameWD, getHost(),
	  getresourceURI()); }
	  
	  @Then("User should see the Response Code {int}, ResultCode and Appropriate Message When GEN Xolair Order Created Successfully"
	  ) public void user_should_see_the_Response_Code_Successfull_GEN_Xolair_Order(Integer
	  ResponseCode) { int ActualrespCode = resp.getStatusCode();
	  assertEquals(ActualrespCode, ResponseCode.intValue());
	  System.out.println(ResponseCode.intValue()); }
	 
}
