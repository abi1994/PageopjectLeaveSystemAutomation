package com.abi.Automation.Pages;

import com.abi.Automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class DesignationPage extends PageBase {

    private static final Logger LOGGER= Logger.getLogger(DesignationPage.class);

    private static By AddDeignation = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div[2]/div/div/table/thead/tr/th/button");
    private static By SaveDesignation =By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private static By CloseDesignation =By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    private static By InputDesignation =By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");




    public static void ClickAddDeignation(){
       implicitWait(5); getDriver().findElement(AddDeignation).click();
    }
    public static void ClickSaveDesignation(){
        implicitWait(5);getDriver().findElement(SaveDesignation).click();
    }

    public static void ClickCloseDesignation(){
        implicitWait(5);getDriver().findElement(CloseDesignation).click();
    }
    public static void ClickInputDesignation(){
        implicitWait(5);getDriver().findElement(InputDesignation).click();
    }

    public static void INputDesignation(){
      implicitWait(5);  getDriver().findElement(InputDesignation).sendKeys("nive");
    }
}
