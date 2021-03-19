package com.cars.step_definitions;

import com.cars.pages.*;
import com.cars.utilities.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class HondaStepDefinitions {

    HondaUsed hondaUsed = new HondaUsed();
    Honda4filters honda4filters = new Honda4filters();
    HondaNew hondaNew = new HondaNew();
    HondaContactSeller hondaContactSeller = new HondaContactSeller();

    @Given("user is in landing page")
    public void user_is_in_landing_page() {
        String actualTitle = MyDriver.get().getTitle();
        String expectedTitle = "New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("select {string}")
    public void select(String car) {
        hondaUsed.selectCar(car);
    }

    @Then("select Make {string}")
    public void select_Make(String honda) {
        hondaUsed.selectMake(honda);
    }

    @Then("select model {string}")
    public void select_model(String pilot) {
        hondaUsed.selectModel(pilot);
    }

    @Then("select price {string}")
    public void select_price(String price) {
        hondaUsed.selectPrice(price);
    }

    @Then("select distance {string}")
    public void select_distance(String miles100) {
        hondaUsed.selectDistance(miles100);
    }

    @Then("enter zipcode {string}")
    public void enter_zipcode(String zipcode) {
        hondaUsed.enterZipCode(zipcode);
        String expectedZip = "60008";
        Assert.assertEquals(expectedZip, zipcode);
        BasePage.clearCookies();
    }

    @Then("click Search button")
    public void click_button() {
        hondaUsed.verifyclickable();
    }

    @Then("verify that {int} filters next to Clear All")
    public void verify_that_filters_next_to(Integer filterSize) {
        Assert.assertTrue(honda4filters.clearAll.isDisplayed());
        int expected = 5;
        int actual = honda4filters.listOfFilters.size();
        Assert.assertEquals(expected, actual);
        System.out.println("Clear all present");
        System.out.println("Filter Size = " + honda4filters.listOfFilters.size());
    }

    @Then("assert selected Price is {string}")
    public void assert_selected_Price(String maxPrice) {
        honda4filters.assert4filters(maxPrice);
        honda4filters.verify4filters(maxPrice);
        System.out.println(maxPrice);
    }

    @Then("assert selected Make is {string}")
    public void assert_selected_Make_is(String honda) {
        honda4filters.assert4filters(honda);
        System.out.println(honda);
    }

    @Then("assert selected Model is {string}")
    public void assert_selected_Model_is(String pilot) {
        honda4filters.assert4filters(pilot);
        System.out.println(pilot);
    }

    @Then("assert selected Condition is {string}")
    public void assert_selected_Condition_is(String used) {
        honda4filters.assert4filters(used);
        System.out.println(used);
    }


    //radio button не работает
    @Then("select {string} radio button from New Used")
    public void select_radio_button_from(String button) {
        hondaNew.radioButton();
    }




    //не сработал, исправить
    @Then("assert {string} filter is displayed")
    public void assert_filter_is_displayed(String string) {
        honda4filters.sizeOfFilter();
        String expected = "New";
        String actual = honda4filters.filterCondition.getText();
        Assert.assertEquals(expected, actual);

    }

    @And("assert {string} filter is not displayed")
    public void assert_filter_is_not_displayed(String expected) {
        String actual = honda4filters.filterCondition.getText();
        Assert.assertEquals(expected, actual);
        honda4filters.verifyFilterDisplayed();

    }

    @Then("select {string} from Trim")
    public void select_from_Trim(String actual) {
        hondaNew.trimSelection();
        String expected = "Touring 8-Passenger";
        Assert.assertEquals(expected, actual);
    }

    @Then("assert {string} filter displayed")
    public void assert_filter_displayed(String string) {
        hondaNew.filterWithTrim();
        String expected = "Touring 8-Passenger";
        String actual = honda4filters.filterCondition.getText();
        Assert.assertEquals(expected, actual);
    }
    //обязательно ли использовать параметр стринг?

    @Then("select second available car")
    public void select_second_available_car() {
        BasePage.scrollDown(hondaNew.secondCar);
        hondaNew.get2ndCar().click();
    }

    @Then("verify title contains {string}")
    public void verify_title_contains(String string) {
        String actualTitle = MyDriver.get().getTitle();
        String expectedTitle = "Honda Pilot 8-Passenger For Sale";
        Assert.assertEquals(expectedTitle, actualTitle);


    }

    @Then("verify {string} button is displayed")
    public void verify_button_is_displayed(String string) {
        BasePage.scrollDown(hondaContactSeller.checkAvailability);
        hondaContactSeller.availabilityButton();

    }

    @Then("in {string} enter  {string}")
    public void in_enter(String string, String string2) {
        hondaContactSeller.enterText(string, string2);
        //нужен ли здесь асершн?
    }

    @And("{string} enter {string}")
    public void enter(String string, String string2) {
        hondaContactSeller.enterText(string, string2);

    }

    @And("email {string} enter {string}")
    public void email_enter(String string, String string2) {
        hondaContactSeller.enterText(string, string2);

    }


    @Then("scroll down and take screenshot of {string}")
    public void scroll_down_and_take_screenshot_of(String string) {


    }
}