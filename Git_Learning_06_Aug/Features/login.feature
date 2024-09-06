Feature: User login

  Scenario: Successful login
    Given the user is on git hub login page
    When the user enters valid credentials (username: "sushmarvaidya5@gmail.com", password: "Sush@789")
    And the user clicks on the Login button
    Then the user should be redirected to the Repository page
