package com.abi.automation.Tests;

import com.abi.Automation.Pages.DashboardPage;
import com.abi.Automation.Pages.DesignationPage;
import com.abi.Automation.Pages.RecuitmentTypePage;
import com.abi.automation.Utils.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DesignationTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(DesignationTest.class);

    @Test(priority = 1)
    public void AddRecuritment(){

        extentTest = extentReport.startTest("LeasoftAssert = new SoftAssert();\n" + "extentTestveType");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickDesignationmenu();
        LOGGER.info("Dashboard sub menu click");
        DesignationPage.ClickAddDeignation();
        LOGGER.info("Add RecuritType click ");
        DesignationPage.INputDesignation();
        DesignationPage.ClickSaveDesignation();

        // DesignationPage.ClickCloseDesignation();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

}
