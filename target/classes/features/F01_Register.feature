@Smoke
Feature: F01_Register | user registration with new account

  Scenario: register with valid data successfully

    And user go to website
    And user click register
    When  user enter valid data select gender type "male" fname"Elsayed" lname"Elkholy" day"11" month"10" year"1997" email"elsayed@gmail.com"
    And user fills Password fields "P@ssw0rd123" and "P@ssw0rd123"
    And user clicks on register button
    Then success message is displayed