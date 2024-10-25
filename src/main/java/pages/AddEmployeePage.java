package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id="firstName")
    public static WebElement FirstName;

    @FindBy(id="middleName")
    public WebElement MiddleName;

    @FindBy(id="lastName")
    public static WebElement LastName;

    @FindBy(id="employeeId")
    public static WebElement empID;

    @FindBy(id="btnSave")
    public WebElement SaveButton;

    @FindBy(id="txtUsername")
    public WebElement userName;

    @FindBy(id="txtPassword")
    public WebElement Password;

    @FindBy (id ="btnLogin")
    public WebElement loginButton;

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(xpath = "//div[@class='message warning fadable']")
    public static WebElement existingEmpIdErrorMsg;

    public AddEmployeePage(){

        PageFactory.initElements(driver, this);
    }


}