Feature: BMS OrderAPI Positive Test

 Scenario: BMS OrderApi PlaceOrder SuccessValidation
    Given User perform POST Operation for Successfull BMS Order Creation
    Then User should see the Response Code 200, ResultCode and Appropriate Message When Order Created Successfully
    
     Scenario: BMS OrderApi Place Order With Multiple Products Success Validation
    Given User perform POST Operation for Multiple products
    Then User should see the Response Code 200, Result Code and Appropriate Message When Order Created Successfully for Multiple products
    
    
   Scenario: BMS OrderApi Place Order With Mandatory Fields Success Validation
    Given User perform POST Operation for  Mandatory Fields Success Validation
    Then User should see the Response Code 200, Result Code and Appropriate Message When Order Created Successfully for Mandatory Fields
    
      Scenario: BMS OrderApi PlaceOrder Success Validation SourceCode
    Given User perform POST Operation for  SourceCode Success Validation
    Then User should see the Response Code 200, Result Code and Appropriate Message When Order Created Successfully for SourceCode
    
    Scenario: BMS OrderApi PlaceOrder Success Validation Without SourceCode
    Given User perform POST Operation for  Without SourceCode Success Validation
    Then User should see the Response Code 200, Result Code and Appropriate Message When Order Created Successfully for Without SourceCode