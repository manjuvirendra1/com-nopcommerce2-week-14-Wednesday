package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.utilities.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.verifyRegisterText();
    }
    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        registerPage.verifyFirstNameErrorText();
        registerPage.verifyLastNameErrorText();
        registerPage.verifyEmailFieldErrorText();
        registerPage.verifyPasswordFieldErrorText();
        registerPage.verifyConfirmPasswordErrorText();
    }
    @Test(groups = {"smoke", "regression"})
    public void VerifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnGender();
        registerPage.fillingTheDetails("Prime" + getAlphaNumericString(4),"Testing" + getAlphaNumericString(4),"26","August","1984",
                "PT@gmail.com" + getAlphaNumericString(4),"Mv12345","Mv12345");
        registerPage.clickOnRegisterButton();
        registerPage.verifyRegistrationText();


    }


}
