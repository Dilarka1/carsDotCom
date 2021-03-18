package com.cars.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HondaNew extends BasePage {

    @FindBy(xpath = "//label[@class='radio__label'])[2]")
    public WebElement radioNew;

    @FindBy(xpath = "//body/div[@id='ae-main-content']/div[4]/cars-filters[1]/div[2]/div[1]/div[1]/form[1]/ul[1]/li[4]/ul[1]/li[2]/label[1]")
    public WebElement filterNew;

    @FindBy(xpath = "//label[contains(text(),'Touring 8-Passenger')]")
    public WebElement trim8passenger;

    @FindBy(xpath = "//header/div[1]/ul[1]/li[5]/label[1]")
    public WebElement filterTrim8;


    @FindBy(xpath = "//ul[@class='breadcrumbs']//label[@role='presentation']")
    List<WebElement> filterList;


    public void checkFilters(List<WebElement> filterList) {
        for (WebElement filter : filterList) {
            System.out.println("Button clicked: " + filter.getText());
        }
    }

    //    public void verifyFilter(String filterNew, String filterUsed) {
//        Assert.assertTrue(filterNew.isDisplayed());
//        Assert.assertTrue(!filterUsed.isDisplayed());
//    }
}
