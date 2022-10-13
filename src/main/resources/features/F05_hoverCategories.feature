@Smoke
Feature: hoverCategories | User hover on one of main categories then click on subcategory

  Background: user could login with valid data
    Given user navigate to Home page
    And user go to login page
    When user enter "elsayed@gmail.com" and "P@ssw0rd123"
    And user press on login button
    Then user login to the system successfully

  Scenario: User hover on one of main categories then click on subcategory
    When user hover on Computer categories select notebooks subcategory
    And user hover on Electronics categories select cell phones subcategory
    And user hover on apparel categories select shoes subcategory
