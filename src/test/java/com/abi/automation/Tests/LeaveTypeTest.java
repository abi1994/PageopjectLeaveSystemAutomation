package com.abi.automation.Tests;

import com.abi.Automation.Pages.DashboardPage;
import com.abi.Automation.Pages.LeaveTypePage;
import com.abi.automation.TestData.LeaveType.AddLeaveType;
import com.abi.automation.Utils.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;



public class LeaveTypeTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LeaveTypeTest.class);

    @Test(testName = "AddLeaveType", dataProviderClass = AddLeaveType.class,dataProvider = "AddLeaveType")
    public void AddLeaveType(String type) {


        extentTest = extentReport.startTest("Add LeaveType");
        DashboardPage.ClickManageLeaveMenu();
        DashboardPage.IsDashboardPageDisplay();
        LOGGER.info("DashBoardPage is menu CLick");
        DashboardPage.ClickLeaveTypeAndPoliciesMenu();
        LOGGER.info("DashBoardPage is Submenu Leavetype Click");
        LeaveTypePage.clickAddButtonClick();
        LeaveTypePage.SendKeyAddLeave(type);
        LeaveTypePage.ClickLeaveTypeSaveButton();
        LeaveTypePage.ClickConformAddLeaveType();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
