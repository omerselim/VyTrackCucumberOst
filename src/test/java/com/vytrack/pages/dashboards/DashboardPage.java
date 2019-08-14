package com.vytrack.pages.dashboards;

import com.vytrack.utilities.BasePage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

    public void navigateToModule(String tab, String module) {
        String tabLocator="//span[@class='title title-level-1'][contains(text(),'" + tab + "')]";
        String moduleLocator="//li[@class='dropdown-menu-single-item first']//span[contains(text(),'" + module + "')]";
        Driver.getDriver().findElement(By.xpath(tabLocator)).click();
        BrowserUtils.waitFor(1);
        Driver.getDriver().findElement(By.xpath(moduleLocator)).click();

    }
}
