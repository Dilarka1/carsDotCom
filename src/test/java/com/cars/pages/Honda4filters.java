package com.cars.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import org.openqa.selenium.NoSuchElementException;

public class Honda4filters extends BasePage {

    @FindBy(xpath = "//header//label[contains(text(),'Clear All')]")
    public WebElement clearAll;

    @FindBy(xpath = "//header//label[contains(text(),'Max')]")
    public WebElement filterMaxPrice500;

    @FindBy(xpath = "//header//label[contains(text(),'Honda')]")
    public WebElement filterMakeHonda;

    @FindBy(xpath = "//header//label[contains(text(),'Pilot')]")
    public WebElement filterModelPilot;

    @FindBy(xpath = "//header//label[contains(text(),'New')]")
    public WebElement filterNew;

    @FindBy(xpath = "//header//label[contains(text(),'Used')]")
    public WebElement filterUsed;

    @FindBy(xpath = "//header//label[contains(text(),'Touring 8-Passenger')]")
    public WebElement filterTrim;

    @FindBy(xpath = "//header//ul[@class='breadcrumbs']//label")
    public List<WebElement> listOfFilters;


    public void sizeOfFilter() {
        for (WebElement each : listOfFilters) {
            System.out.println(each.getText());
            if (each.getText().contains("New")) {
                System.out.println(each.getText());
            }
        }
    }

    public void verifyFilterDisplayed() {
        Assert.assertTrue(filterUsed.isDisplayed());
        Assert.assertFalse(filterUsed.equals("Used"));
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

        } else if (expected.equals(filterUsed.getText())) {
            String actual = filterUsed.getText();
            Assert.assertEquals(expected, actual);
            Assert.assertTrue(filterUsed.isDisplayed());
        } else if (expected.equals(filterNew.getText())) {
            String actual = filterNew.getText();
            Assert.assertEquals(expected, actual);
            Assert.assertTrue(filterNew.isDisplayed());
        } else {
            Assert.assertTrue(clearAll.isDisplayed());
        }
    }

    public void verify4filters(String clear) {
        Assert.assertTrue(clearAll.isDisplayed());
        Assert.assertTrue(filterMakeHonda.isDisplayed());
        Assert.assertTrue(filterModelPilot.isDisplayed());
        Assert.assertTrue(filterUsed.isDisplayed());
    }

    public boolean isUsedFilterDisplayed() {
        try {
            filterUsed.getText();
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Used element is not displayed");
            return false;
        }
    }
}