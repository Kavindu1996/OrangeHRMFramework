Feature: Orange HRM Login Flow
  Scenario: Verify login and logout functionality

    Given user opens OrangeHRM login page
    When  user enters valid credentials
    Then user verifies dashboard page
    When user navigates to admin page
    Then user verifies system users page
    And user log out
