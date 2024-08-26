package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(@name, 'remove')]")
    private List<WebElement> removeFromCartButtons;

    @FindBy(xpath = "//*[contains(@id, 'checkout')]")
    private WebElement checkoutButton;

    public int getAmountOfItems(){
        return removeFromCartButtons.size();
    }

    public WebElement getCheckoutButton(){
        return checkoutButton;
    }

    public void clickCheckOutButton(){
        checkoutButton.click();
    }

    public void clickRemoveButton(int index){
        removeFromCartButtons.get(index).click();
    }

}
