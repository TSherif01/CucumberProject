package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AddEmployeePage;
import utils.CommonMethods;

public class AddEmployeeToHRMS extends CommonMethods {


    @Then("user is able to click on PIM tab")
    public void user_can_click_on_pim_tab() {
        click(dashbordPage.pimOption);
    }

    @Then("user is able to click on Add Employee tab")
    public void user_can_click_on_add_employee_tab() {
        click(dashbordPage.AddEmployee);
    }

    @Then("user is able to enter firstname and lastname")
    public void user_can_enter_firstname_and_lastname() {
        sendText("Jane", AddEmployeePage.FirstName);
        sendText("Doe", AddEmployeePage.LastName);
    }

    @Then("user is able to click on Save button")
    public void user_can_click_on_save_button() {
        click(dashbordPage.AddEmployee);
    }

    @Then("user is able to enter employee ID")
    public void user_can_enter_employee_id() {
        WebElement empID = AddEmployeePage.empID;
    }

    @Then("the system should provide error messages for users")
    public void the_system_should_provide_error_messages_for_users() {
        Assert.assertTrue(AddEmployeePage.existingEmpIdErrorMsg.isDisplayed());
    }
}
