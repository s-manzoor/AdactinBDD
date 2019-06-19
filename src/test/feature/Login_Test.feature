Feature: Login Actions

  @RegressionTests
  Scenario: Login Failure
    Given User provides invalid login credentials
    When User clicks Login button
    Then Login failure error message is displayed

  @SmokeTests
  Scenario: Successful login with valid credentials
    Given User provides login credentials
    When User clicks Login button
    Then SearchHotel page is displayed