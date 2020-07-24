Feature: GEN Xolair OrderAPI Negative Test

  Scenario Outline: GEN Xolair Order API Mandatory Field Validation
    Given User perform POST Operation for Validating GEN Xolair MandatoryFields - Test Case Name - "<TestCaseName>"
    Then User should see the Response Code <ResponseCode>, ResultCode and Appropriate Error Message When GEN Xolair Mandatory Fields missing in the Request

    Examples: 
     | TestCaseName                                             | ResponseCode |
      |GENXolair_OrderAPI_MandatoryFieldValidation_UserName     |          401 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_Password     |          401 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_OrderNumber  |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_LastName     |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_FirstName    |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_MDMID        |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_RequestDate  |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_ShipAddress1 |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_ShipCity     |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_ShipState    |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_ShipZipCode  |          400 |    
      |GENXolair_OrderAPI_MandatoryFieldValidation_SLN          |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_Code         |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_SRFImage     |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_Quantity     |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_RepFirstName |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_RepLastName  |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_RepCode      |          400 |
      |GENXolair_OrderAPI_MandatoryFieldValidation_Territorycode|          400 |
      
      Scenario Outline: GEN Xolair Order API Field Type Validation
    Given User perform POST Operation for Validating GEN Xolair FieldTypes - Test Case Name - "<TestCaseName>"
    Then User should see the Response Code <ResponseCode>, ResultCode and Appropriate Error Message When GEN Xolair Field Type is Invalid

    Examples: 
      | TestCaseName                                             | ResponseCode |
      | GENXolair_OrderAPI_FieldTypeValidation_Quantity          |          400 |
      | GENXolair_OrderAPI_FieldTypeValidation_requestDate       |          400 |

  Scenario Outline: GEN Xolair Order API Field Length Validation
    Given User perform POST Operation for Validating GEN Xolair FieldLength - Test Case Name - "<TestCaseName>"
    Then User should see the Response Code <ResponseCode>, ResultCode and Appropriate Error Message When GEN Xolair Field Length is Invalid

    Examples: 
      | TestCaseName                                                    | ResponseCode |
      | GENXolair_OrderAPI_FieldLengthValidation_ShipZipCode_MinLength  |          400 |
      | GENXolair_OrderAPI_FieldLengthValidation_ShipZipCode_MaxLength  |          400 |
      | GENXolair_OrderAPI_FieldLengthValidation_ShipState_MinLength    |          400 |
      | GENXolair_OrderAPI_FieldLengthValidation_ShipState_MaxLength    |          400 |
      | GENXolair_OrderAPI_FieldLengthValidation_ShipCity_MinLength     |          400 |
      | GENXolair_OrderAPI_FieldLengthValidation_ShipCity_MaxLength     |          400 |
      
      
       Scenario: New Order with already existing Order Number Rejected for Duplicate
    Given User perform POST Operation for Validating GEN Xolair Duplicate OrderNumber
    Then User should see the Response Code 400, ResultCode and Appropriate Error Message for GEN Xolair Duplicate Order Number
    
      Scenario: Order Rejected when Request sent with GEN Xolair Invalid SRF Image
    Given User perform POST Operation for Validating GEN Xolair Invalid SRF Image 
    Then User should see the Response Code 400, Result Code and Appropriate Error Message for GEN Xolair Invalid SRF Image

    Scenario: Order Rejected when Request sent with GEN Xolair both products combined
    Given User perform POST Operation for Validating GEN Xolair Combined with both Products
    Then User should see the Response Code 400, ResultCode and Appropriate Error Message for GEN Xolair Combined with both products