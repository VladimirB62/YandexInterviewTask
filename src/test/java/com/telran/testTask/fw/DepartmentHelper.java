package com.telran.testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepartmentHelper extends HelperBase{
    public DepartmentHelper(WebDriver driver) {
        super(driver);
    }

    public void selectDepartment(String department) {
        click(By.xpath("//span[text()='" + department +"']"));
    }
}
