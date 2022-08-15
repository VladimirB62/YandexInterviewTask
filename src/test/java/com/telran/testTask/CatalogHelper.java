package com.telran.testTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogHelper extends HelperBase{
    public CatalogHelper(WebDriver driver) {
        super(driver);
    }

    public void selectCatalog(String category) {
        click(By.cssSelector("[href='/catalog--"+ category +"/list?filter-express-delivery=1&searchContext=express']"));
    }
}
