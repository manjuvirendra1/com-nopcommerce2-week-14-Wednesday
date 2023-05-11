package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLinkText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;



    public void verifyWelcomeText() {
        Reporter.log("Verify Text Welcome, Please Sign In!" + verifyWelcomeText.toString() + "<br>");
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromElement(verifyWelcomeText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Verify Text Welcome, Please Sign In!");
    }

    public void enterEmailId(String email) {
        Reporter.log("Enter EmailId " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter Password " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on loginButton" + loginButton.toString() + "<br>");
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }

    public void getErrorMessage() {
        Reporter.log("Get errorMessage" + errorMessage.toString() + "<br>");
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = getTextFromElement(errorMessage);
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
        CustomListeners.test.log(Status.PASS, "Get errorMessage");


    }
    public void verifyLogoutLink() {
        Reporter.log("Logout Link Displayed" + logoutLinkText.toString() + "<br>");
        String expectedLogoutLink = "Log out";
        String actualLogoutLink = getTextFromElement(logoutLinkText);
        Assert.assertEquals(expectedLogoutLink, actualLogoutLink, "Logout Link Displayed");
        CustomListeners.test.log(Status.PASS, "Logout Link Displayed");
    }


    public void verifyLoginLink() {
        Reporter.log("Login Link Displayed" + loginLink.toString() + "<br>");
        String expectedLoginLink = "Log in";
        String actualLoginLink = getTextFromElement(loginLink);
        Assert.assertEquals(expectedLoginLink, actualLoginLink, "Login Link Displayed");
        CustomListeners.test.log(Status.PASS, "Login Link Displayed");
    }




}

