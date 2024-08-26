package com.homework.pages.checkout;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutComplete extends BasePage {
    public CheckoutComplete(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "back-to-products")
    private WebElement backHomeButton;

    public void clickBackHomeButton(){
        backHomeButton.click();
    }

    public WebElement getBackHomeButton() {
        return backHomeButton;
    }
}
