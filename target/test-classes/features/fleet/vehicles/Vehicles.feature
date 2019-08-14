@vehicles_VYT12-78
Feature: Vehicles
  As a truck driver I should be able to access vehicle under Fleet module,see list of all vehicles

  Scenario: Login as driver and navigate to the Vehicles
    Given user is on the landing page
    When user logs in as a "driver"
    Then user navigates to "Fleet" and "Vehicles"
    And user verifies that "Cars" page name is displayed
#    And user verifies that default page number is 1

#  Scenario: System should display general information about the car
#    Given user is on the landing page
#    When user logs in as a "driver"
#    Then user navigates to "Fleet" and "Vehicles"
#    Then click on any car on the grid
#    And system should be able to display general information
#
#  Scenario: Truck driver should add an event
#    Given user is on the landing page
#    When user logs in as a "driver"
#    Then user navigates to "Fleet" and "Vehicles"
#    Then click on any car on the grid
#    And click on "AddEvent" button
#    Then event should be displayed under "Activity" and "GeneralInformation"
#
#  Scenario: Truck driver should reset the grid
#    Given user is on the landing page
#    When user logs in as a "driver"
#    Then user navigates to "Fleet" and "Vehicles"
#    Then click on "GridSetting" located at right upper corner of the tab
#    And truck driver should be able reset the grid