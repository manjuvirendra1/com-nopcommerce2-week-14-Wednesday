package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramField;
    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement hddField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement oSField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifySuccessMessage;

    //public void enterTheSelections(String processor, String ram,
                                  // String hdd, String os, String software) {
       // Reporter.log("Enter The Selections");
        //selectByVisibleTextFromDropDown(processorField,processor);
        //selectByVisibleTextFromDropDown(ramField, ram);
        // clickOnElement1(hddField, hdd);
        // clickOnElement1(oSField, os);
        //clickOnElement1(softwareField, software);
        //CustomListeners.test.log(Status.PASS, "Enter The Selections");
   // }
    public void selectFromDropDown(String processor){
        Reporter.log("Enter Processor" + processorField.toString() + "<br>");
        selectByVisibleTextFromDropDown(processorField, processor);
        CustomListeners.test.log(Status.PASS, "Enter Processor" + processor);
    }
    public void selectFromDropDown1(String ram){
        Reporter.log("Enter Ram" + ramField.toString() + "<br>");
        selectByVisibleTextFromDropDown(ramField, ram);
        CustomListeners.test.log(Status.PASS, "Enter Ram" + ram);
    }
    public void optionSelection(String hdd){
        Reporter.log("Click On Option" + hddField.toString() + "<br>");
       clickOnElement1(hddField, hdd);
        CustomListeners.test.log(Status.PASS, "Click On Option");
    }
    public void optionSelection1(String os){
        Reporter.log("Click On Option" + oSField.toString() + "<br>");
        clickOnElement1(oSField, os);
        CustomListeners.test.log(Status.PASS, "Click On Option");
    }
    public void optionSelection2(String software){
        Reporter.log("Click On Option" + softwareField.toString() + "<br>");
        clickOnElement1(softwareField, software);
        CustomListeners.test.log(Status.PASS, "Click On Option");
    }


    public void clickAddToCart() {
        Reporter.log("Click On Add To Cart");
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click On Add To Cart");
    }

    public void verifySuccessMessage() {
        Reporter.log("Verify Success Message");
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = getTextFromElement(verifySuccessMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Verify Success Message");
    }


}
