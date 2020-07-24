Feature: BMS OrderAPI Negative Test

  Scenario Outline: BMS Order API Mandatory Field Validation
    Given User perform POST Operation for Validating MandatoryFields - Test Case Name - "<TestCaseName>"
    Then User should see the Response Code <ResponseCode>, ResultCode and Appropriate Error Message When Mandatory Fields missing in the Request

    Examples: 
     | TestCaseName                               | ResponseCode |
      |BMS_MandatoryFieldValidation_UserName      |          401 |
      |BMS_MandatoryFieldValidation_Password      |          401 |
      | BMS_MandatoryFieldValidation_OrderNumber  |          400 |
      | BMS_MandatoryFieldValidation_LastName     |          400 |
      | BMS_MandatoryFieldValidation_FirstName    |          400 |
      | BMS_MandatoryFieldValidation_MDMID        |          400 |
      | BMS_MandatoryFieldValidation_RequestDate  |          400 |
      | BMS_MandatoryFieldValidation_ShipAddress1 |          400 |
      | BMS_MandatoryFieldValidation_ShipCity     |          400 |
      | BMS_MandatoryFieldValidation_ShipState    |          400 |
      |BMS_MandatoryFieldValidation_ShipZipCode   |          400 |    
      | BMS_MandatoryFieldValidation_SLN          |          400 |
      | BMS_MandatoryFieldValidation_Code         |          400 |
      | BMS_MandatoryFieldValidation_SRFImage     |          400 |
      |BMS_MandatoryFieldValidation_Quantity      |          400 |
      
      

  Scenario Outline: BMS Order API Field Type Validation
    Given User perform POST Operation for Validating FieldTypes - Test Case Name - "<TestCaseName>"
    Then User should see the Response Code <ResponseCode>, ResultCode and Appropriate Error Message When Field Type is Invalid

    Examples: 
      | TestCaseName                             | ResponseCode |
      | BMS_FieldTypeValidation_Quantity         |          400 |
      | BMS_FieldTypeValidation_requestDate      |          400 |
      | BMS_FieldTypeValidation_SignaturePresent |          400 |

  Scenario Outline: BMS Order API Field Length Validation
    Given User perform POST Operation for Validating FieldLength - Test Case Name - "<TestCaseName>"
    Then User should see the Response Code <ResponseCode>, ResultCode and Appropriate Error Message When Field Length is Invalid

    Examples: 
      | TestCaseName                                     | ResponseCode |
      | BMS_FieldLengthValidation_ShipZipCode_MinLength  |          400 |
      | BMS_FieldLengthValidation_ShipZipCode_MaxLength  |          400 |
      | BMS_FieldLengthValidation_ShipState_MinLength    |          400 |
      | BMS_FieldLengthValidation_ShipState_MaxLength    |          400 |
      | BMS_FieldLengthValidation_ShipCity_MinLength     |          400 |
      | BMS_FieldLengthValidation_ShipCity_MaxLength     |          400 |
      
      
      
  Scenario: New Order with already existing Order Number Rejected for Duplicate
    Given User perform POST Operation for Validating Duplicate OrderNumber
    Then User should see the Response Code 400, ResultCode and Appropriate Error Message for Duplicate Order Number
    
      Scenario: Order Rejected when Request sent with Invalid SRF Image
    Given User perform POST Operation for Validating Invalid SRF Image in an Order
    Then User should see the Response Code 400, Result Code and Appropriate Error Message for Invalid SRF Image


