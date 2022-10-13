@Smoke
Feature: Follow Us|| user could follow site social accounts

  Background: user login to system
    Given user navigate to Home page
    And user go to login page
    When user enter "elsayed@gmail.com" and "P@ssw0rd123"
    And user press on login button
    Then user login to the system successfully

  Scenario: User Follow Facebook
    When user click on facebook
    Then navigated to facebook "https://www.facebook.com/nopCommerce"

  Scenario: User Follow Twitter
    When user click on twitter
    Then navigated to twitter "https://twitter.com/nopCommerce"

  Scenario: User Follow rss
    When user click on rss
    Then navigated to rss "https://demo.nopcommerce.com/nopcommerce-new-release"

  Scenario: User Follow youtube
    When user click on youtube
    Then navigated to youtube "https://www.youtube.com/user/nopCommerce"