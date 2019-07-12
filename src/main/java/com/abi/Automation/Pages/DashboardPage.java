package com.abi.Automation.Pages;

import com.abi.Automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


public class DashboardPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(DashboardPage.class);

    private static By hrmDashBoard = By.xpath("//*[@id=\"root\"]/div/header/nav/a[2]");
    private static By hrmDashBoardmenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[1]/a");
    private static By profilemenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a");
    private static By leavemenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a");
    private static By manageemployemenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a");
    private static By manageleavemenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a");
    private static By manageusermenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[6]/a");
    private static By settingsmenu = By.xpath("//*[@id=\"sidebar\"]/ul/li[7]/a");

    private static By leavetypeandpoliciesmenu = By.xpath("//*[@id=\"page3\"]/ul/li[2]/a");
    private static By leavedashboardmenu = By.xpath("//*[@id=\"page3\"]/ul/li[1]/a");
    private static By leaveallocationmenu = By.xpath("//*[@id=\"page3\"]/ul/li[3]/a");
    private static By lieuleavemenu = By.xpath("//*[@id=\"page3\"]/ul/li[4]/a");
    private static By leavetypeandpoliciesdashboard = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div[1]/h3");

    private static By recitmentmenu =By.xpath("//*[@id=\"page2\"]/ul/li[1]/a");

    private static By Designationmenu =By.xpath("//*[@id=\"page2\"]/ul/li[2]");//*[@id="page2"]/ul/li[2]/a

    public static void ClickLeaveTypeAndPoliciesMenu(){
       implicitWait(5); getDriver().findElement(leavetypeandpoliciesmenu).click();
    }

    public static boolean IsdisplyLeaveType(){
        return getDriver().findElement(leavetypeandpoliciesmenu).isDisplayed();
    }




    public static void ClickHrmDashBoardMenu(){
        getDriver().findElement(hrmDashBoardmenu).click();
    }

    public static void ClickProfilemenu(){
        getDriver().findElement(profilemenu).click();
    }

    public static void ClickLeaveMenu(){
        getDriver().findElement(leavemenu).click();
    }
    public static void ClickManageEmployeMenu(){
        getDriver().findElement(manageemployemenu).click();
    }

    public static void ClickManageLeaveMenu(){implicitWait(5);
        getDriver().findElement(manageleavemenu).click();
    }

    public static void ClickManageUserMenu(){
        getDriver().findElement(manageusermenu).click();
    }
    public static void ClickSettingMenu(){
        getDriver().findElement(settingsmenu).click();
    }

    public static boolean IsDashboardPageDisplay() {

        return getDriver().findElement(hrmDashBoardmenu).isDisplayed();
    }



    public static void ClickRecitmentmenu(){
        getDriver().findElement(recitmentmenu).click();
    }

    public static void ClickDesignationmenu(){
        implicitWait(5);getDriver().findElement(Designationmenu).click();
    }
}
