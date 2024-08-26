package com.homework.tests;

import com.homework.pages.*;
import com.homework.pages.checkout.Checkout2Page;
import com.homework.pages.checkout.CheckoutComplete;
import com.homework.pages.checkout.CheckoutPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    @Parameters({ "FIRST_NAME", "LAST_NAME", "ZIP_CODE"})
    public void purchaseProductsTest(String FIRST_NAME, String LAST_NAME, String ZIP_CODE) {
        //Inventory
        InventoryPage inventoryPage = getInventoryPage();
        Assert.assertTrue(inventoryPage.getAmountOfItems() > 0);
        int ammountOfItemsToAdd = 1;

        for (int i = 0; i < ammountOfItemsToAdd; i++) {
            inventoryPage.clickAddToCartButton(i);
        }

        inventoryPage.clickShoppingCartButton();

        //Cart
        CartPage cartPage = getCartPage();
        Assert.assertEquals(cartPage.getAmountOfItems(), ammountOfItemsToAdd);
        waitForClickable(10,cartPage.getCheckoutButton());
        cartPage.clickCheckOutButton();

        //CheckOut
        CheckoutPage checkoutPage = getCheckoutPage();
        checkoutPage.inputFirstName(FIRST_NAME);
        checkoutPage.inputLastName(LAST_NAME);
        checkoutPage.inputPostalCode(ZIP_CODE);
        checkoutPage.clickContinueButton();

        //Checkout2
        Checkout2Page checkout2Page = getCheckout2Page();
        Assert.assertTrue(checkout2Page.finishButtonExists());
        checkout2Page.clickFinishButton();

        //CheckoutComplete
        CheckoutComplete checkoutComplete = getCheckoutComplete();
        waitForClickable(10,checkoutComplete.getBackHomeButton());
        checkoutComplete.clickBackHomeButton();
    }

}
