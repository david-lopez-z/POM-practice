package com.homework.pages.checkout;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public void inputFirstName(String name){
        firstNameInput.sendKeys(name);
    }

    public void inputLastName(String name){
        lastNameInput.sendKeys(name);
    }

    public void inputPostalCode(String code){
        postalCodeInput.sendKeys(code);
    }

    public void clickContinueButton(){
        continueButton.click();
    }


    public WebElement getPostalCodeInput() {
        return postalCodeInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

}

