package steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;

public class LoginValidation extends CommonMethods {


    @Given("user able to click on login button")
    public void user_able_to_click_on_login_button() throws IOException {
        click(loginPage.loginButton);
    }
    @Then("system display an error message stating Username cannot be empty")
    public void system_display_an_error_message_stating_username_cannot_be_empty() {
        Assert.assertTrue(loginPage.ErrorMsg.isDisplayed());
        System.out.println("Test Passed");
    }
    @Given("user should able to enter username")
    public void user_should_able_to_enter_username() {
        sendText("Admin", loginPage.userName);
    }
    @Then("user should able to click on login button")
    public void user_should_able_to_click_on_login_button() {
        click(loginPage.loginButton);
    }
    @Then("system display an error message stating Password is empty")
    public void system_display_an_error_message_stating_password_is_empty() {
        Assert.assertTrue(loginPage.ErrorMsg.isDisplayed());
    }
    @Then("the user enters incorrect {string} and {string}")
    public void the_user_enters_incorrect_and(String username, String password) {
        sendText(username,loginPage.userName);
        sendText(password, loginPage.Password);
        click(loginPage.loginButton);
    }
    @Then("an error message should be displayed Invalid credentials")
    public void an_error_message_should_be_displayed_invalid_credentials() {
        Assert.assertTrue(loginPage.ErrorMsg.isDisplayed());
        String actualMSG = loginPage.ErrorMsg.getText();
        Assert.assertEquals("Invalid credentials", actualMSG);
    }
    @Then("after displaying the error user should be able to login again by correct username and password")
    public void after_displaying_the_error_user_should_be_able_to_login_again_by_correct_username_and_password() {
        sendText(ConfigReader.read("userName"), loginPage.userName);
        sendText(ConfigReader.read("password"), loginPage.Password);
        click(loginPage.loginButton);
    }


}