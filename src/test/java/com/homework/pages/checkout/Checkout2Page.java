package com.homework.pages.checkout;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout2Page extends BasePage {
    public Checkout2Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(name="finish")
    private WebElement finishButton;

    public void clickFinishButton(){
        finishButton.click();
    }

    public boolean finishButtonExists(){
        return finishButton != null;
    }


}
