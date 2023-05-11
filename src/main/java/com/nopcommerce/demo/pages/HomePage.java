package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

     @CacheLookup
     @FindBy(xpath = "//a[contains(text(),'Register')]")
     WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersTab;




    public void clickOnLoginLink(){
        Reporter.log("Click on Login Link"+ loginLink.toString() + "<br>");
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Click on Login Link");
    }
    public void clickOnRegisterLink(){
        Reporter.log("Click on Register Link"+ registerLink.toString() + "<br>");
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click on Register Link");
    }

    public void clickOnLogoutLink() {
        Reporter.log("Click on logoutLink" + logoutLink.toString() + "<br>");
        clickOnElement(logoutLink);
        CustomListeners.test.log(Status.PASS, "Click on logoutLink");
    }

    public void clickOnComputerTab() {
        Reporter.log("Click on Computer Tab" + computersTab.toString() + "<br>");
        clickOnElement(computersTab);
        CustomListeners.test.log(Status.PASS, "Click on Computer Tab");
    }


}
