package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeePage {
    WebDriver driver;

    By firstNameField = By.id("firstName");
    By middleNameField = By.id("middleName");
    By lastNameField = By.id("lastName");
    By employeeIdField = By.id("employeeId");
    By addButton = By.id("addButton");
    By successMessage = By.id("successMessage");

    public EmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterMiddleName(String middleName) {
        driver.findElement(middleNameField).sendKeys(middleName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmployeeId(String employeeId) {
        driver.findElement(employeeIdField).sendKeys(employeeId);
    }

    public void clickAdd() {
        driver.findElement(addButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
