Feature: GEN Xolair OrderAPI Positive Test

 Scenario: GEN Xolair OrderApi PlaceOrder SuccessValidation
    Given User perform POST Operation for Successfull Order Creation for GEN Xolair
    Then User should see the Response Code 200, ResultCode and Appropriate Message When GEN Xolair Order Created Successfully
    
     