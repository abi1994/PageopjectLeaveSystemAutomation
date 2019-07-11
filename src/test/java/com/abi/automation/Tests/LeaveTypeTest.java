package com.abi.automation.Tests;

import com.abi.Automation.Pages.DashboardPage;
import com.abi.Automation.Pages.LeaveTypePage;
import com.abi.automation.Utils.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;



public class LeaveTypeTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LeaveTypeTest.class);

    @Test(priority = 1)
    public void AddLeaveType() {


        extentTest = extentReport.startTest("LeasoftAssert = new SoftAssert();\n" + "extentTestveType");
        DashboardPage.ClickManageLeaveMenu();
        DashboardPage.IsDashboardPageDisplay();
        LOGGER.info("DashBoardPage is menu CLick");
        DashboardPage.ClickLeaveTypeAndPoliciesMenu();
        LOGGER.info("DashBoardPage is Submenu Leavetype CLick");
        LeaveTypePage.clickAddButtonClick();
        LeaveTypePage.SendKeyAddLeave();
        LeaveTypePage.clickAddButtonClick();
        //LeaveTypePage.CLickCloseLeaveTypeButton();
//        LeaveTypePage.setLeaveType(Constants.OrgUserName);
        //  LeaveTypePage.clickSaveButtonClick();
        //LeaveTypePage.implicitWait(3);
//        LeaveTypePage.click_ok_Button();
        // LeaveTypePage.clickCancelButtonClick();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
