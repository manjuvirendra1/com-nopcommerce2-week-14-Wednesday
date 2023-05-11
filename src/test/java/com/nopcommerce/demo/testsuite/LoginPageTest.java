package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickOnLoginLink();
        loginPage.verifyWelcomeText();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage();

    }
    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() throws InterruptedException {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Prime123@gmail.com");
        loginPage.enterPassword("Mv123456");
        loginPage.clickOnLoginButton();
        Thread.sleep(3000);
        loginPage.verifyLogoutLink();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        Thread.sleep(3000);
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("Prime123@gmail.com");
        loginPage.enterPassword("Mv123456");
        loginPage.clickOnLoginButton();
        homePage.clickOnLogoutLink();
        loginPage.verifyLoginLink();

    }
}
