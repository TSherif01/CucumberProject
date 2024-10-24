package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("I open the HRM portal")
    public void i_open_the_HRM_portal() {
        driver = new ChromeDriver();
        driver.get("http://example.com/login"); // Replace with actual URL
        loginPage = new LoginPage(driver);
    }

    @When("I submit the login form with username {string} and password {string}")
    public void i_submit_the_login_form(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String expectedMessage) {
        String actualMessage = loginPage.getErrorMessage();
        assert actualMessage.equals(expectedMessage);
        driver.quit();
    }
}
