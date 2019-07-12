package com.abi.automation.Tests;

import com.abi.Automation.Pages.DashboardPage;
import com.abi.Automation.Pages.DesignationPage;
import com.abi.automation.Utils.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DesignationTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(DesignationTest.class);

    @Test(priority = 1)
    public void AddRecuritment(){

        extentTest = extentReport.startTest("Add Recuritmen");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickDesignationmenu();
        LOGGER.info("Dashboard sub menu click");
        DesignationPage.ClickAddDeignation();
        LOGGER.info("Add RecuritType click ");
        DesignationPage.ClickInputDesignation();
        LOGGER.info("Click the inputBox");
        DesignationPage.INputDesignation();
        DesignationPage.ClickSaveDesignation();
        DesignationPage.AddConformDesignation();
        extentTest.log(LogStatus.PASS, " Leave management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void CloseRecuritment(){

        extentTest = extentReport.startTest("Close Recuritment");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickDesignationmenu();
        LOGGER.info("Dashboard sub menu click");
        DesignationPage.ClickAddDeignation();
        LOGGER.info("Add RecuritType click ");
        DesignationPage.ClickCloseDesignation();
        //DesignationPage.AddConformDesignation();
        extentTest.log(LogStatus.PASS, " Leave management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void EditRecuritment(){

        extentTest = extentReport.startTest("Edit Recuriment");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickDesignationmenu();
        LOGGER.info("Dashboard sub menu click");
        DesignationPage.ClickEditDesignation();
        LOGGER.info("Edit RecuritType click ");
        DesignationPage.ClickEditInBoxDesignation();
        LOGGER.info("Click the inputBox");
        DesignationPage.ClearEditInBoxDesignation();
        DesignationPage.SendValuseEditDesignation();
        DesignationPage.ClickEditUpdateDesignation();
        extentTest.log(LogStatus.PASS, " Leave management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void EditCloseRecuritment(){

        extentTest = extentReport.startTest("EditCloseRecuritment");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickDesignationmenu();
        LOGGER.info("Dashboard sub menu click");
        DesignationPage.ClickEditDesignation();
        LOGGER.info("Edit RecuritType click ");
        DesignationPage.ClickEditCloseDesignation();
        extentTest.log(LogStatus.PASS, " Leave management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }


    @Test(priority = 6)
    public void DeleteRecuritment(){

        extentTest = extentReport.startTest("DeleteRecuritment");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickDesignationmenu();
        LOGGER.info("Dashboard sub menu click");
        DesignationPage.ClickDeleteDesignation();
        LOGGER.info("Edit RecuritType click ");
        DesignationPage.ClickDeleteConformDesignation();
        DesignationPage.ClickDeleteConformOkDesignation();
        extentTest.log(LogStatus.PASS, " Leave management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test(priority = 5)
    public void DeleteCancelRecuritment(){

        extentTest = extentReport.startTest("Delete Cancel Recuritment");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickDesignationmenu();
        LOGGER.info("Dashboard sub menu click");
        DesignationPage.ClickDeleteDesignation();
        LOGGER.info("Edit RecuritType click ");
        DesignationPage.ClickDeleteCancelDesignation();
        DesignationPage.ClickDeleteCancelOkDesignation();
        extentTest.log(LogStatus.PASS, " Leave management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }


}
