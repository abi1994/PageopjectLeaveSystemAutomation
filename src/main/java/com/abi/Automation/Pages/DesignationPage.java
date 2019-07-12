package com.abi.Automation.Pages;

import com.abi.Automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class DesignationPage extends PageBase {

    private static final Logger LOGGER= Logger.getLogger(DesignationPage.class);

    private static By AddDeignation = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div/section/div/div[1]/button");
    private static By SaveDesignation =By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private static By CloseDesignation =By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    private static By InputDesignation =By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    private static By AddComformationDesignatin= By.xpath("/html/body/div[2]/div/div[4]/div/button");
    private static By EditDesignatin= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div/section/div/div[2]/table/tr[1]/td/div/button[1]");
    private static By EditInboxDesignatin= By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    private static By EditUpdateDesignatin= By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private static By EditCloseDesignatin= By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    private static By DeleteDesignatin= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div/section/div/div[2]/table/tr/td/div/button[2]");
    private static By DeleteConformDesignatin= By.xpath("/html/body/div[2]/div/div[4]/div[2]/button");
    private static By DeleteConformOkDesignatin= By.xpath("/html/body/div[2]/div/div[3]/div/button");
    private static By DeleteCanelDesignatin= By.xpath("/html/body/div[2]/div/div[4]/div[1]/button");
    private static By DeleteCanelOkDesignatin= By.xpath("/html/body/div[2]/div/div[2]/div/button");



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
    public static void AddConformDesignation(){
       implicitWait(5); getDriver().findElement(AddComformationDesignatin).click();
    }
    public static void ClickEditDesignation(){
        implicitWait(5);
        getDriver().findElement(EditDesignatin).click();
    }

    public static void ClickEditInBoxDesignation(){implicitWait(5);getDriver().findElement(EditInboxDesignatin).click();}
    public static void ClearEditInBoxDesignation(){implicitWait(5);getDriver().findElement(EditInboxDesignatin).clear();}
    public static void SendValuseEditDesignation(){implicitWait(5);getDriver().findElement(EditInboxDesignatin).sendKeys("Nivethana");}
    public static void ClickEditUpdateDesignation(){implicitWait(5);getDriver().findElement(EditUpdateDesignatin).click();}
    public static void ClickEditCloseDesignation(){implicitWait(5);getDriver().findElement(EditCloseDesignatin).click();}
    public static void ClickDeleteDesignation(){implicitWait(5);getDriver().findElement(DeleteDesignatin).click();}
    public static void ClickDeleteConformDesignation(){implicitWait(5);getDriver().findElement(DeleteConformDesignatin).click();}
    public static void ClickDeleteConformOkDesignation(){implicitWait(5);getDriver().findElement(DeleteConformOkDesignatin).click();}
    public static void ClickDeleteCancelDesignation(){implicitWait(5);getDriver().findElement(DeleteCanelDesignatin).click();}
    public static void ClickDeleteCancelOkDesignation(){implicitWait(5);getDriver().findElement(DeleteCanelOkDesignatin).click();}
}
