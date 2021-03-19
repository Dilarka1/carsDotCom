package com.cars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
    public WebElement searchButton;


    public void selectCar(String car) {
        Select select = new Select(usedCar);
        select.selectByVisibleText(car);
    }

    public void selectMake(String honda) {
        Select select = new Select(usedMake);
        select.selectByVisibleText(honda);
    }

    public void selectModel(String pilot) {
        Select select = new Select(usedModel);
        select.selectByVisibleText(pilot);
    }

    public void selectPrice(String price) {
        Select select = new Select(priceMax);
        select.selectByVisibleText(price);
    }

    public void selectDistance(String mile100) {
        Select select = new Select(distance);
        select.selectByVisibleText(mile100);
    }

    public void enterZipCode(String zipcode) {
        zipCode.clear();
        zipCode.sendKeys(zipcode);
    }

    public void verifyclickable() {
        searchButton.click();
    }
}