package com.telran.testTask.fw;

import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelperBase {
    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void acceptCookies() {
        driver.findElement(By.cssSelector("[data-id='button-all']")).click();
    }

    public void switchToNextTab(int number) {
        List<String> availableWindows = new ArrayList<>(driver.getWindowHandles());
        if (!availableWindows.isEmpty()){
            driver.switchTo().window(availableWindows.get(number));
        }

    }

    public void type(By locator, String text) {
        click(locator);
        if (text!=null){
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }

    }

    public  void takeScreenshot(String pathToFile) {
        var tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshot = new File(pathToFile);
        try {
            Files.copy(tmp,screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
