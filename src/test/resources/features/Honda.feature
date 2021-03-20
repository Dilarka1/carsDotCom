@unit_test
Feature: Testing Car.com

  @honda
  Scenario: Testing Used Honda
    Given user is in landing page
    When select "Used Cars"
    And select Make "Honda"
    And select model "Pilot"
    And select price "$50,000"
    And select distance "100 Miles from"
    And enter zipcode "60008"
    And click Search button
    Then verify that 4 filters next to Clear All
    And assert selected Price is "Maximum Price: $50,000"
    And assert selected Make is "Honda"
    And assert selected Model is "Pilot"
    And assert selected Condition is "Used"
    When select "New" radio button from New Used
    Then assert "New" filter is displayed
    And assert "Used" filter is not displayed
    When select "Touring 8-Passenger" from Trim
    Then assert "Touring 8-Passenger" filter displayed
    When select second available car
    Then verify title contains "Honda Pilot Touring 8-Passenger For Sale"
    And verify "Check Availability" button is displayed
    When in "First Name" enter  "Car"
    And "Last Name" enter "Owner"
    And email "Email" enter "carowner@yahoo.com"
    Then scroll down and take screenshot of "Payment Calculator"