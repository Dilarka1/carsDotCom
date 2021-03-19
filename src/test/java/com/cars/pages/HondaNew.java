package com.cars.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HondaNew extends BasePage {

    //проверить
    @FindBy(xpath = "//label[contains(text(),\"New\") and @class='radio__label']")
    // id = "[id='stkTypId-28880']"
    public WebElement radioNew;

    @FindBy(id = "ae_filter_id164")
    public WebElement trim;

    @FindBy(xpath = "//label[contains(text(),'Touring 8-Passenger')]")
    public WebElement trim8passenger;




    //проверить нельзяли использовать лист
    @FindBy(xpath = "//header/div[1]/ul[1]/li[5]/label[1]")
    public WebElement filterTrim8;

    @FindBy(xpath = "//header//ul[@class='breadcrumbs']//label")
    public List<WebElement> filterList;


    @FindBy(xpath = "//a[@data-position='2']")
    public WebElement secondCar;

    @FindBy(xpath = "//div[@class='listing-row__details']")
    public List<WebElement> listOfCars;



    public WebElement getSecondCar(int carNum) {
        return listOfCars.get(carNum - 1);
    }

    public WebElement get2ndCar() {
        return listOfCars.get(1);
    }

    public void radioButton() {
        scrollDown(radioNew);
        radioNew.click();
        //  Assert.assertTrue(radioNew.isSelected());
    }

    public void checkFilters(List<WebElement> filterList) {
        for (WebElement filter : filterList) {
            System.out.println("Button clicked: " + filter.getText());
        }
    }

    public void trimSelection() {
        scrollDown(trim);
        trim8passenger.isSelected();
    }

    public void filterWithTrim() {
        for (WebElement each : filterList) {
            System.out.println(each.getText());
            if (each.getText().contains("Touring 8-Passenger")) {
                System.out.println(each.getText());
            }
        }
    }
}