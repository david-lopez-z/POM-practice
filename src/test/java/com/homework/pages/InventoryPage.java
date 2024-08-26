package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class InventoryPage extends BasePage {

    private static final Logger log = LoggerFactory.getLogger(InventoryPage.class);

    public InventoryPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[contains(@id, 'add-to-cart')]")
    private List<WebElement> addToCartButtons;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartButton;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement hamburgerButton;

    @FindBy(xpath = "//*[contains(@id, 'logout')]")
    private WebElement logoutButton;

    public void clickShoppingCartButton(){
        shoppingCartButton.click();
    }

    public int getAmountOfItems(){
        return addToCartButtons.size();
    }

    public void clickAddToCartButton(int index){
        addToCartButtons.get(index).click();
    }

    public void clickLogoutButton(){
        logoutButton.click();
    }

    public void clickHamburgerButton(){
        hamburgerButton.click();
    }

    public WebElement getLogoutButton(){
        return logoutButton;
    }
}
