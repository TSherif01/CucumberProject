package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EmployeePage;

public class EmployeeSteps {
    WebDriver driver;
    EmployeePage employeePage;

    @Given("I am on the Add Employee page")
    public void i_am_on_the_Add_Employee_page() {
        driver = new ChromeDriver();
        driver.get("http://example.com/addEmployee"); // Replace with actual URL
        employeePage = new EmployeePage(driver);
    }

    @When("I add an employee with first name {string}, middle name {string}, last name {string} and employee ID {string}")
    public void i_add_an_employee(String firstName, String middleName, String lastName, String employeeId) {
        employeePage.enterFirstName(firstName);
        employeePage.enterMiddleName(middleName);
        employeePage.enterLastName(lastName);
        employeePage.enterEmployeeId(employeeId);
        employeePage.clickAdd();
    }

    @Then("I should see a success message {string}")
    public void i_should_see_a_success_message(String expectedMessage) {
        String actualMessage = employeePage.getSuccessMessage();
        assert actualMessage.equals(expectedMessage);
        driver.quit();
    }
}
