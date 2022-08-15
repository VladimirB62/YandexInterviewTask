package com.telran.testTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

    ItemHelper item;
    MarketHelper market;
    DepartmentHelper department;
    CategoryHelper category;
    CatalogHelper catalog;
    SearchHelper search;

    public ItemHelper getItem() {
        return item;
    }

    public MarketHelper getMarket() {
        return market;
    }

    public DepartmentHelper getDepartment() {
        return department;
    }

    public CategoryHelper getCategory() {
        return category;
    }

    public CatalogHelper getCatalog() {
        return catalog;
    }

    public SearchHelper getSearch() {
        return search;
    }

    public void stop() {
        driver.quit();
    }

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://yandex.ru/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        item = new ItemHelper(driver);
        market = new MarketHelper(driver);
        department = new DepartmentHelper(driver);
        category = new CategoryHelper(driver);
        catalog = new CatalogHelper(driver);
        search = new SearchHelper(driver);
    }


}
