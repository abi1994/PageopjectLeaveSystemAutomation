package com.abi.automation.Tests;



import com.abi.Automation.Pages.DashboardPage;
import com.abi.Automation.Pages.RecuitmentTypePage;
import com.abi.automation.Utils.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import static com.abi.automation.Utils.TestBase.extentReport;

public class RecuitmentTypeTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(RecuitmentTypeTest.class);

    @Test(priority = 1)
    public void AddRecuritment(){

        extentTest = extentReport.startTest("LeasoftAssert = new SoftAssert();\n" + "extentTestveType");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickRecitmentmenu();
        LOGGER.info("Dashboard sub menu click");
        RecuitmentTypePage.ClickAddRecurit();
        LOGGER.info("Add RecuritType click ");
        RecuitmentTypePage.InputrecuritType();
        RecuitmentTypePage.ClickSaverecurit();
        RecuitmentTypePage.ClickOkAddrecurit();

       // RecuitmentTypePage.ClickCloserecurit();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }


    @Test(priority = 2)
    public void Colserecuritment(){
        extentTest = extentReport.startTest("LeasoftAssert = new SoftAssert();\n" + "extentTestveType");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickRecitmentmenu();
        LOGGER.info("Dashboard sub menu click");
        RecuitmentTypePage.ClickAddRecurit();
        LOGGER.info("Add RecuritType click ");
        RecuitmentTypePage.InputrecuritType();
         RecuitmentTypePage.ClickCloserecurit();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
    @Test(priority =3 )
    public void EditRecuriment(){

        extentTest = extentReport.startTest("LeasoftAssert = new SoftAssert();\n" + "extentTestveType");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickRecitmentmenu();
        LOGGER.info("Dashboard sub menu click");
        RecuitmentTypePage.ClickEditButton();
        LOGGER.info("Add RecuritType click ");
        RecuitmentTypePage.Clearrecurit();
        RecuitmentTypePage.SendValueEdit();
        RecuitmentTypePage.Updaterecurit();
        RecuitmentTypePage.UpdaterecuritOk();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

    @Test(priority = 4)
    public void DeleteRecuricancel(){

        extentTest = extentReport.startTest("LeasoftAssert = new SoftAssert();\n" + "extentTestveType");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickRecitmentmenu();
        LOGGER.info("Dashboard sub menu click");
        RecuitmentTypePage.ClickDeleteButtonrecurit();
        LOGGER.info("Add RecuritType click ");
        RecuitmentTypePage.ClickDeletepopupCansel();
        RecuitmentTypePage.ClickDeletepopupCancelOk();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test(priority = 5)
    public void DeleteRecuriment(){

        extentTest = extentReport.startTest("LeasoftAssert = new SoftAssert();\n" + "extentTestveType");

        DashboardPage.ClickManageEmployeMenu();
        LOGGER.info("Dashboard menu click ");
        DashboardPage.ClickRecitmentmenu();
        LOGGER.info("Dashboard sub menu click");
        RecuitmentTypePage.ClickDeleteButtonrecurit();
        LOGGER.info("Add RecuritType click ");
        RecuitmentTypePage.ClickDeletepopupconform();
        RecuitmentTypePage.ClickDeletepopupconformOk();
        extentTest.log(LogStatus.PASS, " library management system : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

}
