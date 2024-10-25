package utils;

import pages.AddEmployeePage;
import pages.DashbordPage;
import pages.LoginPage;

import static utils.CommonMethods.driver;

public class PageIntializer {

    public static LoginPage loginPage;
    public static DashbordPage dashbordPage;
    private static AddEmployeePage addemployeePage;

    public static void initializePageObject() {

        loginPage = new LoginPage(driver);
        addemployeePage = new AddEmployeePage();
        dashbordPage = new DashbordPage();
    }
}