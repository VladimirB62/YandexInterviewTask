package com.telran.testTask;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{


    @Test
    public void searchItemTest() {
        app.getMarket().selectMarket();
        app.getMarket().switchToNextTab(1);
        app.getDepartment().selectDepartment("Экспресс");
        app.getDepartment().acceptCookies();
        app.getCatalog().selectCatalog("elektronika/23282330");
        app.getCategory().selectCategoryType("smartfony-i-aksessuary/23282379");

        app.getItem().filterItem(new Item().setPriceFrom("20000")
                .setPriceTo("35000")
                .setBrand("Apple"));
        app.getItem().pause(20000);

        String itemName = app.getItem().getItemNameFromListByNumber(3);
        app.getSearch().typeInSearchInputField(app.getItem().getItemNameFromListByNumber(3));
        app.getSearch().pause(20000);
        String foundItemName = app.getItem().getItemNameFromListByNumber(2);
        Assert.assertEquals(foundItemName, itemName);

    }


}
