package com.cars.step_definitions;

import com.cars.pages.BasePage;
import com.cars.pages.Honda4filters;
import com.cars.pages.HondaNew;
import com.cars.pages.HondaUsed;
import com.cars.utilities.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;


public class HondaStepDefinitions {

    HondaUsed hondaUsed = new HondaUsed();
    Honda4filters honda4filters = new Honda4filters();
    HondaNew hondaNew = new HondaNew();

    @Given("user is in landing page")
    public void user_is_in_landing_page() {
        String actualTitle = MyDriver.get().getTitle();
        String expectedTitle = "New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("select {string}")
    public void select(String car) {
        hondaUsed.selectCar(car);
        System.out.println("Select Used Cars : " + car);
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
        System.out.println("100 miles!!!!!!!!" + miles100);
        BasePage.clearCookies();
    }

    @Then("enter zipcode {string}")
    public void enter_zipcode(String zipcode) {
        hondaUsed.enterZipCode(zipcode);
        System.out.println("Zip Code : " + zipcode);

        String expectedZip = "60008";
        Assert.assertEquals(expectedZip, zipcode);

        BasePage.clearCookies();

    }

    @Then("click Search button")
    public void click_button() {
        hondaUsed.verifyclickable();

    }


    @Then("verify that {int} filters next to {string}")
    public void verify_that_filters_next_to(Integer filterSize, String clearAll) {
        honda4filters.assert4filters(filterSize.toString());
    }

    @Then("assert selected Make is {string}")
    public void assert_selected_Make_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("assert selected Model is {string}")
    public void assert_selected_Model_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("assert selected Condition is {string}")
    public void assert_selected_Condition_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }










    @Then("assert price filter is {string}")
    public void assert_price_filter(String price) {
        honda4filters.assert4filters(price);
    }

    @Then("assert selected filter is {string}")
    public void assert_selected_filter(String string) {
        honda4filters.verify4filters(string);
    }

    @Then("assert selected {string}")
    public void assert_selected(String string) {

    }

    @Then("select {string} radio button from {string}")
    public void select_radio_button_from(String string, String string2) {

    }

    @Then("assert {string} filter is displayed")
    public void assert_filter_is_displayed(String string) {

    }

    @Then("assert {string} filter is not displayed")
    public void assert_filter_is_not_displayed(String string) {

    }

    @Then("select {string} from Trim")
    public void select_from_Trim(String string) {

    }

    @Then("select second available car")
    public void select_second_available_car() {

    }

    @Then("verify title contains {string}")
    public void verify_title_contains(String string) {

    }

    @Then("verify {string} button is displayed")
    public void verify_button_is_displayed(String string) {

    }

    @Given("Second available car page")
    public void page(String string) {

    }

    @Then("click on {string} button")
    public void click_on_button(String string) {

    }

    @Then("in {string} enter  {string}")
    public void in_enter(String string, String string2) {

    }

    @Then("{string} enter {string}")
    public void enter(String string, String string2) {

    }

    @Then("take screenshot")
    public void take_screenshot() {

    }
}