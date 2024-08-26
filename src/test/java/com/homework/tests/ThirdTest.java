package com.homework.tests;

import com.homework.pages.InventoryPage;
import com.homework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest{

    @Test
    public void logoutTest(){
        InventoryPage inventoryPage = getInventoryPage();
        inventoryPage.clickHamburgerButton();
        waitForClickable(10,inventoryPage.getLogoutButton());
        inventoryPage.clickLogoutButton();

        LoginPage loginPage = getLoginPage();
        Assert.assertTrue(loginPage.getSubmitButton().isDisplayed());
    }
}
