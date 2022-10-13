@smoke
Feature: Switch Currency | user could switch between currencies

  Background: user login to system
    Given user navigate to Home page
    And user go to login page
    When user enter "elsayed@gmail.com" and "P@ssw0rd123"
    And user press on login button
    Then user login to the system successfully


  Scenario: logged user could switch between currencies
    When user choose Euro from dropdown menu
    Then euro is selected successfully
    When user choose USD from dropdown menu
    Then USD is selected successfully