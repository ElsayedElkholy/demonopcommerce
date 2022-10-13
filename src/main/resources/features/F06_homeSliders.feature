@Smoke
Feature: home Sliders | user could click on page sliders

  Background: user login to system
    Given user navigate to Home page
    And user go to login page
    When user enter "elsayed@gmail.com" and "P@ssw0rd123"
    And user press on login button
    Then user login to the system successfully

  Scenario: user could click on page sliders
    When user click on button_one and click on first_slider
    And navigate to the first slider page
    When user click on button_two and click on second_slider
    And navigate to the second slider page
