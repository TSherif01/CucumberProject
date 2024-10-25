package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy (id ="btnLogin")
    public WebElement loginButton;

    @FindBy(id="spanMessage")
    public WebElement ErrorMsg;

    @FindBy(id="txtUsername")
    public WebElement userName;

    @FindBy(id="txtPassword")
    public WebElement Password;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(CommonMethods.driver, this);
    }

    public void enterUsername(String username) {
    }

    public void enterPassword(String password) {
    }

    public void clickLogin() {
    }
}