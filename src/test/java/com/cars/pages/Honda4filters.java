package com.cars.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Honda4filters extends BasePage {

    @FindBy(xpath = "//header/div[1]/ul[1]/li[1]/label[1]")
    public WebElement clearAll;

    @FindBy(xpath = "//header/div[1]/ul[1]/li[2]/label[1]")
    public WebElement filterMaxPrice500;

    @FindBy(xpath = "//header/div[1]/ul[1]/li[3]/label[1]")
    public WebElement filterMakeHonda;

    @FindBy(xpath = "//header/div[1]/ul[1]/li[4]/label[1]")
    public WebElement filterModelPilot;

    @FindBy(xpath = "//header/div[1]/ul[1]/li[5]/label[1]")
    public WebElement filterCondition;


    public void assert4filters(String expected) {

        if (expected.equals(filterMaxPrice500.getText())) {
            String actual = filterMaxPrice500.getText();
            Assert.assertEquals(expected, actual);

        } else if (expected.equals(filterMakeHonda.getText())) {
            String actual = filterMakeHonda.getText();
            Assert.assertEquals(expected, actual);

        }else if (expected.equals(filterModelPilot.getText())) {
            String actual = filterModelPilot.getText();
            Assert.assertEquals(expected, actual);

        }else if (expected.equals(filterCondition.getText())){
            String actual = filterCondition.getText();
            Assert.assertEquals(expected, actual);
        }
    }

    public void verify4filters(String clear) {
        Assert.assertTrue(clearAll.isDisplayed());
        Assert.assertTrue(filterMakeHonda.isDisplayed());
        Assert.assertTrue(filterModelPilot.isDisplayed());
        Assert.assertTrue(filterCondition.isDisplayed());
    }

    /*
    нужен лист элементов, что они присутвуют

       landing page == search page
     */

}
