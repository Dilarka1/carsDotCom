package com.cars.pages;

import com.cars.utilities.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HondaUsed extends BasePage {

    @FindBy(name = "stockType")
    public WebElement usedCar;

    @FindBy(name = "makeId")
    public WebElement usedMake;

    @FindBy(name = "modelId")
    public WebElement usedModel;

    @FindBy(name = "priceMax")
    public WebElement priceMax;

    @FindBy(name = "radius")
    public WebElement distance;

    @FindBy(name = "zip")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@value='Search']")
            //"//body/div[@id='root']/div[@id='ae-main-content']/section[2]/div[1]/form[1]/div[1]/div[6]/input[1]")
    public WebElement searchButton;


    public void selectCar(String car) {
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(usedCar);
        select.selectByVisibleText(car);
    }

    public void selectMake(String honda) {
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(usedMake);
        select.selectByVisibleText(honda);
    }

    public void selectModel(String pilot) {
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(usedModel);
        select.selectByVisibleText(pilot);
    }

    public void selectPrice(String price) {
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(priceMax);
        select.selectByVisibleText(price);
    }

    public void selectDistance(String mile100) {
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(distance);
        select.selectByVisibleText(mile100);
    }

    public void enterZipCode(String zipcode) {
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        zipCode.sendKeys(zipcode);
    }


    public void verifyclickable() {
        //Trying to make sure page loaded and all the elements visible.
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //to see the process putting 3 second wait.
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        searchButton.click();
    }
}