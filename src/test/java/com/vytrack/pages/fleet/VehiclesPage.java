package com.vytrack.pages.fleet;

import com.vytrack.utilities.BasePage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage extends BasePage {
    @FindBy(xpath = "//label[text()='Page:']/following-sibling::ul//input")
    public WebElement pageNumber;

    @FindBy(css = "h5.user-fieldset:nth-child(1) > span:nth-child(1)")
    public WebElement generalInformation;

    @FindBy(css = "a[class='btn icons-holder-text no-hash']")
    public WebElement addEvent;


    public Integer getPageNumber(){
        return  Integer.valueOf(pageNumber.getAttribute("value"));
    }


    public static void clickRandomVehicle() {
        int size =BrowserUtils.getCountOfRows(By.cssSelector("tbody[class='grid-body']>tr"));       // table[id='table1'] > tbody>tr
        int random=BrowserUtils.randomInt(size);
        Driver.getDriver().findElement(By.cssSelector("tbody[class='grid-body'] tr:nth-of-type(" + random + ")")).click();

    }
}
