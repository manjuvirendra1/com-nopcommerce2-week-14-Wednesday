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

public class RegisterPage extends Utility {

    public RegisterPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameErrorText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameErrorText;



    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailFieldErrorText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordFieldErrorText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordFieldErrorText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement gender;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearDropDown;


    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationText;


    public void verifyRegisterText(){
        Reporter.log("Verify Register Text is Displayed");
        String expectedMessage = "Register";
        String actualMessage = getTextFromElement(registerText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Verify Register Text is Displayed");
    }


    public void clickOnRegisterButton() {
        Reporter.log("Click on Register Button");
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Click on Register Button");
    }


    public void verifyFirstNameErrorText(){
        Reporter.log("First name is required.");
        String expectedMessage = "First name is required.";
        String actualMessage = getTextFromElement(firstNameErrorText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "First name is required.");
    }

    public void verifyLastNameErrorText(){
        Reporter.log("Last name is required.");
        String expectedMessage = "Last name is required.";
        String actualMessage = getTextFromElement(lastNameErrorText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Last name is required.");
    }

    public void verifyEmailFieldErrorText(){
        Reporter.log("Email is required.");
        String expectedMessage = "Email is required.";
        String actualMessage = getTextFromElement(emailFieldErrorText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Email is required.");
    }

    public void verifyPasswordFieldErrorText(){
        Reporter.log("Password is required.");
        String expectedMessage = "Password is required.";
        String actualMessage = getTextFromElement(passwordFieldErrorText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Password is required.");
    }

    public void verifyConfirmPasswordErrorText(){
        Reporter.log("Error Message Displayed");
        String expectedMessage = "Password is required.";
        String actualMessage = getTextFromElement(confirmPasswordFieldErrorText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Error Message Displayed");
    }

    public void clickOnGender(){
        Reporter.log("Select Gender");
        clickOnElement(gender);
        CustomListeners.test.log(Status.PASS, "Select Gender");
    }

    public void fillingTheDetails(String firstName, String lastName, String day, String month, String year,  String email, String password, String confirmPassword){
        Reporter.log("Fill the Details");
        sendTextToElement(firstNameField,firstName);
        sendTextToElement(lastNameField,lastName);
        selectByVisibleTextFromDropDown(dayDropDown,day);
        selectByVisibleTextFromDropDown(monthDropDown,month);
        selectByVisibleTextFromDropDown(yearDropDown,year);
        sendTextToElement(emailField,email);
        sendTextToElement(passwordField,password);
        sendTextToElement(confirmPasswordField,confirmPassword);
        CustomListeners.test.log(Status.PASS, "Fill the Details");
    }

    public void verifyRegistrationText(){
        Reporter.log("Your registration completed");
        String expectedMessage = "Your registration completed";
        String actualMessage = getTextFromElement(registrationText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Your registration completed");
    }

    }





