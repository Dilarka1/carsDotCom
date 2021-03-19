package com.cars.pages;

import com.cars.utilities.MyDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class HondaContactSeller extends BasePage {

    @FindBy(name = "submit")
    public WebElement checkAvailability;

    @FindBy(name = "fname")
    public WebElement enterName;

    @FindBy(name = "lname")
    public WebElement enterLastname;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(xpath = "//div[@class=\"calculator\"]")
    public WebElement calculator;




    public void availabilityButton() {
    checkAvailability.isDisplayed();
    checkAvailability.isEnabled();
    }

    public void enterText(String text, String text2){
        if(text.equals("Fist Name")) {
            enterName.sendKeys(text2);
        }
        if(text.equals("Last Name")) {
            enterLastname.sendKeys(text2);   //"Owner");
        }
        if(text.equals("Email")) {
            email.sendKeys(text2);     //"carowner@yahoo.com");
        }
    }

    public void screenShot(){

        TakesScreenshot scrShot =((TakesScreenshot)MyDriver.get());
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
       // File DestFile=new File(fileName);
      //  FileUtils.copyFile(SrcFile, DestFile);


//        (TakesScreenshot) MyDriver.get()).getScreenshotAs(OutputType.BYTES)
}
}