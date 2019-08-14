package com.vytrack.step_definitions;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class VehiclesStepDefinitions {
    Pages pages = new Pages();

//    @Then("user verifies that default page number is {int}")
//    public void user_verifies_that_default_page_number_is(Integer expected) {
//        Assert.assertEquals(expected, pages.vehiclesPage().getPageNumber());
//    }

    @Then("click on any car on the grid")
    public void click_on_any_car_on_the_grid() {
        BrowserUtils.waitFor(1);
        pages.vehiclesPage().clickRandomVehicle();
    }

    @Then("system should be able to display general information")
    public void system_should_be_able_to_display_general_information() {
        String expected = "General Information";
        String actual = pages.vehiclesPage().generalInformation.getText();
        Assert.assertTrue(actual.equalsIgnoreCase(expected));
    }



}
