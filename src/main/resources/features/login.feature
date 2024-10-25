Feature: Login Validation for HRMS Portal

  @emptyUsernameLogin @invalidLogin
  Scenario:login with empty username field
    Given user able to click on login button
    Then system display an error message stating Username cannot be empty

  @emptyPasswordLogin @invalidLogin
  Scenario: login with empty password field
    Given user should able to enter username
    Then user should able to click on login button
    And system display an error message stating Password is empty

  @emptyUserPasswordLogin  @invalidLogin
  Scenario Outline: login with incorrect username and password
    Then the user enters incorrect "<username>" and "<password>"
    And an error message should be displayed Invalid credentials
    Then after displaying the error user should be able to login again by correct username and password
    Examples:
      | username | password     |
      | adim     | Hum@nhrm123  |
      | admin    | human        |

