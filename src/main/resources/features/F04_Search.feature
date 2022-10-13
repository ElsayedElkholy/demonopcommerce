@Smoke
Feature: Search | User could search of products
  Background: user login to system
    Given user navigate to Home page
    And user go to login page
    When user enter "elsayed@gmail.com" and "P@ssw0rd123"
    And user press on login button
    Then user login to the system successfully

  Scenario Outline: Logged user could search products
    When user click on search field
    And user enter "<search>" to search
    Then user find the product and relative products

    Examples:
      |search|
      |book   |
      |laptop |
      |nike  |

  Scenario Outline: Logged user could search products
    When user click on search field
    And user enter "<search>" to search
    Then user find "<search>" product

    Examples:
      |search|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|

      |AP_MBP_13|

