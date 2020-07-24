Feature: Qpharma OrderAPI Positive Test

  Scenario Outline: Order Created successfully when POST request placed with Valid Data
    Given User perform POST Operation for Successfull Order Creation
    Then User should see the Response Code 200, Result Code and Appropriate Error Message When Order Created Successfully
