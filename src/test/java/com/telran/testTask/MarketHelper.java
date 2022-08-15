package com.telran.testTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketHelper extends HelperBase{
    public MarketHelper(WebDriver driver) {
        super(driver);
    }

    public void selectMarket() {
        click(By.cssSelector("[data-id='market']"));
    }
}
