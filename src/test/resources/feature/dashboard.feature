Feature: Dashboard Tab Names


  Scenario:
    Given The user is on the login page
    When  The user login using "mike@gmail.com" and "mike1234"
    Then The user should be able to see userName: "mike"
    And The user should be able to see all tabs dhown on the dashboard page
    |Dashboard|
    |Developers|
    |Components|
    |Forms|
    |JavaScript|
    |mike|