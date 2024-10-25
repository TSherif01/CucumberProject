package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class LoginPage extends CommonMethods {

    @FindBy (id ="btnLogin")
    public WebElement loginButton;

    @FindBy(id="spanMessage")
    public WebElement ErrorMsg;

    @FindBy(id="txtUsername")
    public WebElement userName;

    @FindBy(id="txtPassword")
    public WebElement Password;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}