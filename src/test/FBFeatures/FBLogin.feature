
  Feature: Login feature
    Scenario: Login with correct user name and password
      Given I navigate to the login page
      And I entered user name as admin and password as admin
      And I click the login button
      Then I should see the user form page