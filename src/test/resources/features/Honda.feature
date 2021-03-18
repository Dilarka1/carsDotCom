@unit_test
Feature: Testing Car.com

  Scenario: Testing Used Honda
    Given user is in landing page
    Then select "Used Cars"
    Then select Make "Honda"
    Then select model "Pilot"
    Then select price "$50,000"
    Then select distance "100 Miles from"
    Then enter zipcode "60008"
    Then click Search button

#  Scenario: Validate that 4 filters are displayed next to `Clear All`
#    Given user got Search result page
    Then assert price filter is "Maximum Price: $50,000"
    Then assert selected Make is "Honda"
    And assert selected Model is "Pilot"
    And assert selected Condition is "Used"

  Scenario: Testing New Honda
    Given user got Search result page
    Then select "New" radio button from "New/Used"
    Then assert "New" filter is displayed
    Then assert "Used" filter is not displayed
    Then select "Touring 8-Passenger" from Trim
    Then assert "Touring 8-Passenger" filter is displayed
    Then select second available car
    Then verify title contains "Honda Pilot 8-Passenger For Sale"
    Then verify "Check Availability" button is displayed

  Scenario: Contact the Seller
    Given Second available car page
    Then click on "Contact Seller" button
    Then in "First Name" enter  "Car"
    Then "Last Name" enter "Owner"
    Then "Email" enter "carowner@yahoo.com"

  Scenario: Take a screenshot  of "Payment Calculator"
    Given Second available car page
    Then take screenshot