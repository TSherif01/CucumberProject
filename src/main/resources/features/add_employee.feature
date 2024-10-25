Feature: Add Employee to HRMS


  @WithoutID  @addemp
  Scenario: user should be able to add an employee without providing an employee ID
    Then user able to click on login button
    Then user able to click on PIM tab
    And user able to click on Add Employee tab
    Then user should able to enter firstname and lastname
    Then user able to click on Save button

  @WithID  @addemp
  Scenario: user should be able to add an employee by providing a unique employee ID
    Then user should able to enter firstname lastname and middleName
    And user should able to enter ID
    Then user able to click on Save button
    Then the system should provide error messages for users