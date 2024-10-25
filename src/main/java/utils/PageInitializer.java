package utils;

import page.AddEmployeeToHRMS;
import page.DashbordPage;
import page.LoginPage;

public class PageIntializer {

    public static LoginPage loginPage;
    public static EmployeePage employeePage;
    public static DashbordPage dashbordPage;

    public static void initializePageObject() {

        loginPage = new LoginPage();
        addEmployeeToHRMS = new AddEmployeeToHRMS();
        dashbordPage = new DashbordPage();
    }
}