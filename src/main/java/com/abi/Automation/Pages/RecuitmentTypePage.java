package com.abi.Automation.Pages;

import com.abi.Automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class RecuitmentTypePage extends PageBase {

    private static final Logger LOGGER= Logger.getLogger(RecuitmentTypePage.class);
    /*recurit Dashboard*/
    private static By recurithd = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[1]/h3");
    private static By Addrecurit =By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[1]/button");
    /*Addrecurit */
    private static By Inputrecurit =By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    private static By Saverecurit =By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private static By Closerecurit =By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    private static By Addrecuritok =By.xpath("/html/body/div[2]/div/div[4]/div/button");
    /*Edit recurit*/
    private static By EditButton =By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[2]/table/tbody/tr[1]/td[2]/button[1]");
    private static By EditInputValue =By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    private static By EditUpdaterecurit=By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private static By EditUpdaterecuritOk=By.xpath("/html/body/div[2]/div/div[4]/div/button");
    /*delete recurit */
    private static By DeleteButton =By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[2]/table/tbody/tr/td[2]/button[2]");
    private static By Deletepopupcancel =By.xpath("/html/body/div[2]/div/div[4]/div[1]/button");
    private static By Deletepopupconform =By.xpath("/html/body/div[2]/div/div[4]/div[2]/button");
    private static By DeletepopupconformOk =By.xpath("/html/body/div[2]/div/div[3]/div/button");
    private static By DeletepopupCancelOk =By.xpath("/html/body/div[2]/div/div[2]/div/button");


    public static void ClickAddRecurit(){
        implicitWait(5);getDriver().findElement(Addrecurit).click();
    }
    public static void InputrecuritType(){
        getDriver().findElement(Inputrecurit).sendKeys("Nivethan");
    }
    public static void ClickSaverecurit(){
        implicitWait(5);getDriver().findElement(Saverecurit).click();
    }

    public static void ClickCloserecurit(){
        implicitWait(5);getDriver().findElement(Closerecurit).click();
    }
    public static void ClickOkAddrecurit(){
       implicitWait(5); getDriver().findElement(Addrecuritok).click();
    }
    public static void ClickEditButton(){
        implicitWait(5);getDriver().findElement(EditButton).click();
    }
    public static void SendValueEdit(){implicitWait(5);getDriver().findElement(EditInputValue).sendKeys("Abirame");}
    public static void Updaterecurit(){implicitWait(5);getDriver().findElement(EditUpdaterecurit).click();}
    public static void Clearrecurit(){implicitWait(5);getDriver().findElement(EditInputValue).clear();}
    public static void UpdaterecuritOk(){implicitWait(5);getDriver().findElement(EditUpdaterecuritOk).click();}



    public static void ClickDeleteButtonrecurit(){implicitWait(5);getDriver().findElement(DeleteButton).click();}
    public static void ClickDeletepopupCansel(){implicitWait(5);getDriver().findElement(Deletepopupcancel).click();}
    public static void ClickDeletepopupconform(){implicitWait(5);getDriver().findElement(Deletepopupconform).click();}
    public static void ClickDeletepopupconformOk(){implicitWait(5);getDriver().findElement(DeletepopupconformOk).click();}
    public static void ClickDeletepopupCancelOk(){implicitWait(5);getDriver().findElement(DeletepopupCancelOk).click();}

}
