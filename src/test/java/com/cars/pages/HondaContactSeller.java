package com.cars.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

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
            enterName.sendKeys(text2); //"Car"
        }
        if(text.equals("Last Name")) {
            enterLastname.sendKeys(text2);   //"Owner");
        }
        if(text.equals("Email")) {
            email.sendKeys(text2);     //"carowner@yahoo.com");
        }
    }

    public void screenShot() throws IOException {
        File f = calculator.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(f, new File(System.getProperty("user.dir")+
                File.separator+"src"+
                File.separator+"test"+
                File.separator+"resources"+
                File.separator+"screenshots"+
                File.separator+"calculator_screenshot.png"));
    }
}