Feature: Qpharma OrderAPI Negative Test

  Scenario Outline: Qpharma Order API Mandatory Field Validation
    Given User perform POST Operation for Validating Mandatory Fields - Test Case Name - "<TestCaseName>"
    Then User should see the Response Code <ResponseCode>, Result Code and Appropriate Error Message When Mandatory Fields missing in the Request

    Examples: 
      | TestCaseName                                   | ResponseCode |
      | OrderApi_MandatoryFieldValidation_OrderNumber  |          400 |
      | OrderApi_MandatoryFieldValidation_LastName     |          400 |
      | OrderApi_MandatoryFieldValidation_LastName     |          400 |
      | OrderApi_MandatoryFieldValidation_FirstName    |          400 |
      | OrderApi_MandatoryFieldValidation_MDMID        |          400 |
      | OrderApi_MandatoryFieldValidation_RequestDate  |          400 |
      | OrderApi_MandatoryFieldValidation_ShipAddress1 |          400 |
      | OrderApi_MandatoryFieldValidation_ShipCity     |          400 |
      | OrderApi_MandatoryFieldValidation_ShipState    |          400 |
      | OrderApi_MandatoryFieldValidation_SLN          |          400 |
      | OrderApi_MandatoryFieldValidation_Products     |          400 |
      | OrderApi_MandatoryFieldValidation_SourceCode   |          400 |
      | OrderApi_MandatoryFieldValidation_Code         |          400 |
      | OrderApi_MandatoryFieldValidation_Quantity     |          400 |
      | OrderApi_MandatoryFieldValidation_SRFImage     |          400 |

  Scenario Outline: Qpharma Order API Field Type Validation
    Given User perform POST Operation for Validating Field Types - Test Case Name - "<TestCaseName>"
    Then User should see the Response Code <ResponseCode>, Result Code and Appropriate Error Message When Field Type is Invalid

    Examples: 
      | TestCaseName                                  | ResponseCode |
      | OrderApi_FieldTypeValidation_Quantity         |          400 |
      | OrderApi_FieldTypeValidation_requestDate      |          400 |
      | OrderApi_FieldTypeValidation_SignaturePresent |          400 |

  Scenario Outline: Qpharma Order API Field Length Validation
    Given User perform POST Operation for Validating Field Length - Test Case Name - "<TestCaseName>"
    Then User should see the Response Code <ResponseCode>, Result Code and Appropriate Error Message When Field Length is Invalid

    Examples: 
      | TestCaseName                                          | ResponseCode |
      | OrderApi_FieldLengthValidation_ShipZipCode_MinLength  |          400 |
      | OrderApi_FieldLengthValidation_ShipZipCode_MaxLength  |          400 |
      | OrderApi_FieldLengthValidation_ShipZipCode4_MinLength |          400 |
      | OrderApi_FieldLengthValidation_ShipState_MinLength    |          400 |
      | OrderApi_FieldLengthValidation_ShipState_MaxLength    |          400 |

  Scenario: New Order with already existing Order Number Rejected for Duplicate
    Given User perform POST Operation for Validating Duplicate Order Number
    Then User should see the Response Code 400, Result Code and Appropriate Error Message for Duplicate Order Number

  Scenario: Order with More than 20 Product Line Items Rejected
    Given User perform POST Operation for Validating Maximum Product Line Items in an Order
    Then User should see the Response Code 400, Result Code and Appropriate Error Message for Maximum Products

  Scenario: Order Rejected when Request sent with Invalid SKU
    Given User perform POST Operation for Validating Invalid SKU in an Order
    Then User should see the Response Code 400, Result Code and Appropriate Error Message for Invalid SKU

    Scenario: Order Rejected when Request sent with Multiple Products having Valid and Invalid SKU
    Given User perform POST Operation for Validating Valid and Invalid SKU in an Order
    Then User should see the Response Code 400, Result Code and Appropriate Error Message for Valid and Invalid SKU
    