@unit_test
Feature: Testing Car.com

  @hondaUsed
  Scenario: Testing Used Honda
    Given user is in landing page
    Then select "Used Cars"
    Then select Make "Honda"
    Then select model "Pilot"
    Then select price "$50,000"
    Then select distance "100 Miles from"
    Then enter zipcode "60008"
    Then click Search button
    Then verify that 4 filters next to Clear All
    Then assert selected Price is "Maximum Price: $50,000"
    Then assert selected Make is "Honda"
    And assert selected Model is "Pilot"
    And assert selected Condition is "Used"
    Then select "New" radio button from New Used
    Then assert "New" filter is displayed
    And assert "Used" filter is not displayed
    Then select "Touring 8-Passenger" from Trim
    Then assert "Touring 8-Passenger" filter displayed
    Then select second available car
    Then verify title contains "Honda Pilot 8-Passenger For Sale"
    Then verify "Check Availability" button is displayed
    Then in "First Name" enter  "Car"
    And "Last Name" enter "Owner"
    And email "Email" enter "carowner@yahoo.com"
    Then scroll down and take screenshot of "Payment Calculator"