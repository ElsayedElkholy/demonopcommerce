@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user navigate to Home page
    And user go to login page
    When user enter "elsayed@gmail.com" and "P@ssw0rd123"
    And user press on login button
    Then user login to the system successfully

  Scenario: user could login with invalid email and password
    Given user navigate to Home page
    And user go to login page
    When user enter "wrong@gmail.com" and "P@ssw0rd123"
    And user press on login button
    Then user login fail msg
