package com.cars.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Honda4filters extends BasePage {

    @FindBy(xpath = "//header//label[contains(text(),'Clear All')]")
    public WebElement clearAll;

    @FindBy(xpath = "//header//label[contains(text(),'Max')]")
    public WebElement filterMaxPrice500;

    @FindBy(xpath = "//header//label[contains(text(),'Honda')]")
    public WebElement filterMakeHonda;

    @FindBy(xpath = "//header//label[contains(text(),'Pilot')]")
    public WebElement filterModelPilot;

    @FindBy(xpath = "//header//label[contains(text(),'Pilot')]")
    public WebElement filterCondition;

    @FindBy(xpath = "//header//ul[@class='breadcrumbs']//label")
    public List<WebElement> listOfFilters;


    public void sizeOfFilter() {
        for (WebElement each : listOfFilters) {
            System.out.println(each.getText());
            if(each.getText().contains("New")){
                System.out.println(each.getText());
            }
        }
    }

    public void verifyFilterDisplayed() {
         Assert.assertTrue(filterCondition.isDisplayed());
         Assert.assertFalse(filterCondition.equals("Used"));
    }

    public void assert4filters(String expected) {

        if (expected.equals(filterMaxPrice500.getText())) {
            String actual = filterMaxPrice500.getText();
            Assert.assertEquals(expected, actual);
            Assert.assertTrue(filterMaxPrice500.isDisplayed());

        } else if (expected.equals(filterMakeHonda.getText())) {
            String actual = filterMakeHonda.getText();
            Assert.assertEquals(expected, actual);
            Assert.assertTrue(filterMakeHonda.isDisplayed());

        } else if (expected.equals(filterModelPilot.getText())) {
            String actual = filterModelPilot.getText();
            Assert.assertEquals(expected, actual);
            Assert.assertTrue(filterModelPilot.isDisplayed());

        } else if (expected.equals(filterCondition.getText())) {
            String actual = filterCondition.getText();
            Assert.assertEquals(expected, actual);
            Assert.assertTrue(filterCondition.isDisplayed());
        } else {
            Assert.assertTrue(clearAll.isDisplayed());
        }
    }

    public void verify4filters(String clear) {
        Assert.assertTrue(clearAll.isDisplayed());
        Assert.assertTrue(filterMakeHonda.isDisplayed());
        Assert.assertTrue(filterModelPilot.isDisplayed());
        Assert.assertTrue(filterCondition.isDisplayed());
    }
}