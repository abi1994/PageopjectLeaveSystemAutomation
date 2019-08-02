package com.abi.Automation.Pages;


import com.abi.Automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class LeaveTypePage extends PageBase {

    private static final Logger LOGGER= Logger.getLogger(LeaveTypePage.class);


    private static  By LeavetypeDashBoard = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div[1]/h3");
    private static By LeaveTableHead =By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div[2]/div/div[1]/table/thead/tr/th/text()");
    private static By TypeAddButton =By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div[2]/div/div[1]/table/thead/tr/th/button");
    private static By closeLeaveTypeButton=By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    private static By SaveLeaveTypeButton=By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private static By ImportLeaveType=By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    private static By conformAddLeaveType=By.xpath("/html/body/div[2]/div/div[4]/div/button");





    public static void clickAddButtonClick(){

        getDriver().findElement(TypeAddButton).click();
    }
    public static void CLickCloseLeaveTypeButton(){

        getDriver().findElement(closeLeaveTypeButton).click();
    }
    public static void SendKeyAddLeave(String txt){
        getDriver().findElement(ImportLeaveType).sendKeys(txt);

    }
    public static void ClickLeaveTypeSaveButton(){

        getDriver().findElement(SaveLeaveTypeButton).click();
    }
    public static void ClickConformAddLeaveType(){
        getDriver().findElement(conformAddLeaveType).click();
    }
}




