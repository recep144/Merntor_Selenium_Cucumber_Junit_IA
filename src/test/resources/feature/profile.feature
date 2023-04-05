@regression
Feature: Profile Page Test

  Scenario: The user navigates to Add education Page


    Given The user is on the login page
    When  The user login using "mike@gmail.com" and "mike1234"
    Then The user should be able to see userName: "mike"
    When The user navigate to "mike" and "My Profile"
    Then The user should be able to see overwiew page
    When  The user navigate to profile tab: "Add Education"
    Then The user should be able to see "Add Education" button

  @wip
  Scenario: The user navigates to Add education Page and fill the education form with List

    Given The user is on the login page
    When  The user login using "mike@gmail.com" and "mike1234"
    Then The user should be able to see userName: "mike"
    When The user navigate to "mike" and "My Profile"
    Then The user should be able to see overwiew page
    When  The user navigate to profile tab: "Add Education"
    Then The user should be able to see "Add Education" button
    When The user fill the form with following list
    |Ankara University|
    |Developer|
    |SdEt|
    |12122022|
    |12062023|
    |Hard|
    Then The user should see added record with: "Ankara University"
    And The user should be able to delete last added record with: "Ankara University"

