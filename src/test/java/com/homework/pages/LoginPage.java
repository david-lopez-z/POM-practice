package com.homework.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement submitButton;

    public void inputUsername(String username){
        usernameInput.sendKeys(username);
    }

    public void inputPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void submitLogin(){
        submitButton.click();
    }

    public WebElement getSubmitButton(){
        return submitButton;
    }
}
