@saucedemo
Feature: Success Shopping Feature


  Scenario Outline: Positive Success Shopping E2E Test

    When The user is on the login page of Saucedemo
    When The user logs in using "performance_glitch_user" and "secret_sauce"
    Then The user Sort the products high to  low with "Price (high to low)"
    Then The user add to cart one item "<first product>"
    Then The user add to cart one item "<second product>"
    And Verify that the basket shows the true number of "2"
    Then The user Navigate to Your cart page
    And Verify that the right items added to cart "<first product>"
    And Verify that the right items added to cart "<second product>"
    Then The user go to checkout page and fill the form
    Then The user and fill the  with "rec" , "tester" and "13579"
    And Verify that the price of items "<first product>"
    And Verify that the price of items "<second product>"
    Then The user Click finish button
    And  Verify that the success shopping message
    Examples:
      | first product       | second product        |
      | Sauce Labs Backpack | Sauce Labs Bike Light |


