package com.homework.tests;

import com.homework.pages.CartPage;
import com.homework.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest{

    @Test
    public void emptyShoppingCartTest(){
        //Inventory
        InventoryPage inventoryPage = getInventoryPage();

        int amountOfItems = 3;

        for (int i = 0; i < amountOfItems; i++) {
            inventoryPage.clickAddToCartButton(i);
        }

        inventoryPage.clickShoppingCartButton();

        //Shopping cart
        CartPage cartPage = getCartPage();

        Assert.assertEquals(cartPage.getAmountOfItems(),amountOfItems);

        for (int i = 0; i < amountOfItems; i++) {
            cartPage.clickRemoveButton(0);
        }

        Assert.assertEquals(cartPage.getAmountOfItems(),0);

    }



}
