package com.telran.testTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends HelperBase{
    public SearchHelper(WebDriver driver) {
        super(driver);
    }

    public void typeInSearchInputField(String itemName) {
        type(By.id("header-search"), itemName);
        click(By.cssSelector("[data-r='search-button']"));
    }
}
