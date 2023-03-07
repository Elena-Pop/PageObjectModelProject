package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurePage extends BasePage {
    @FindBy(id = "flash")
    WebElement alertSuccess;

    @FindBy (css="i.2xicon")
    WebElement logoutButton;


    public SecurePage(WebDriver driver) {
        super(driver);

    }

    public  void  logoutButton(){
        logoutButton.click();
    }

    public boolean checkIfAlertSuccessIsDisplayed() {
        return checkIfAlertSuccessIsDisplayed();

    }


    public boolean checkIfAlertSuccess1IsDisplayed() {
        return checkIfAlertSuccess1IsDisplayed();


    }
    public String getAlertMessageText(){
        return alertSuccess.getText();
    }
    public void clickLogoutButton(){
        logoutButton.click();
    }

}