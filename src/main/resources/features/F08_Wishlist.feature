@Smoke
Feature: WishList|| user could add products to the wishlist

  Background: user login to system
    Given user navigate to Home page
    And user go to login page
    When user enter "elsayed@gmail.com" and "P@ssw0rd123"
    And user press on login button
    Then user login to the system successfully

  Scenario: user could add products to wishlist
    When click on add HTC_One_M8_Android to wishlist
    Then success message appears




