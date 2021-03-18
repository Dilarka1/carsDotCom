package com.cars.pages;

import com.cars.utilities.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HondaNew extends BasePage {

    @FindBy(xpath = "//body/div[@id='ae-main-content']/div[4]/cars-filters[1]/div[2]/div[1]/div[1]/form[1]/ul[1]/li[4]/ul[1]/li[2]/label[1]")
    public WebElement radioNew;

    @FindBy (xpath = "//body/div[@id='ae-main-content']/div[4]/cars-filters[1]/div[2]/div[1]/div[1]/form[1]/ul[1]/li[4]/ul[1]/li[2]/label[1]")
    public WebElement filterNew;

    @FindBy(xpath = "//label[contains(text(),'Touring 8-Passenger')]")
    public WebElement trim8passenger;

    @FindBy(xpath = "//header/div[1]/ul[1]/li[5]/label[1]")
    public WebElement filterTrim8;

    @FindBy(xpath = )



    //    public void verifyFilter(String filterNew, String filterUsed) {
//        Assert.assertTrue(filterNew.isDisplayed());
//        Assert.assertTrue(!filterUsed.isDisplayed());
//    }
}
