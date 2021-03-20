package com.cars.pages;

import com.cars.utilities.MyDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.Set;

public class BasePage {

    protected WebDriverWait wait = new WebDriverWait(MyDriver.get(), 25);

    //When we use @FindBy annotation in this page.
    public BasePage() {

        PageFactory.initElements(MyDriver.get(), this);
    }

    //To use for certain wait time we use this method.
    public void waitforelements() throws InterruptedException {
        Thread.sleep(3000);
    }

    /**
     * Web site does not allow the automation browser
     * Browser is doing it with cookies
     * Cleaning the cookies helped. Needs to be done to every page navigation to make sure
     * automation will work.
     */
    public static void clearCookies() {

        Set<Cookie> a = MyDriver.get().manage().getCookies();
        System.out.println(a);
        //Delete all the cookies
        MyDriver.get().manage().deleteAllCookies();

    }

    public void scrollDown() {
        scrollDown();
    }

    public static void scrollDown(WebElement link) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) MyDriver.get();

        /*  this script must scroll, until link element is visible
         *  once link element visible, it will stop scrolling
         *  arguments[0] = means first webelement after comma (link)
         *  arguments it's an array of webelements after comma
         *  arguments[0] = link web element, it can be any web element
         */
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("arguments[0].scrollIntoView(true)", link);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}