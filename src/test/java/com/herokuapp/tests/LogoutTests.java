package com.herokuapp.tests;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.pages.SecurePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.herokuapp.pages.LoginPage.LOGIN_URL;

public class LogoutTests  extends  BaseTests {

        @BeforeMethod
        protected void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        }
//
//        @Parameters({ "user", "password", "SuccessLogoutMessage" })
//
//
//        @Test
//        public void loginAndLogoutTest (String username, String password, String succesLogout) {
//            driver = new ChromeDriver();
//            driver.get(LOGIN_URL);
//            LoginPage loginPage = new LoginPage(driver);
//            loginPage.enterUsername(username);
//            loginPage.enterPassword(password);
//            loginPage.clickLogin();
//            SecurePage securePage = new SecurePage(driver);
//            securePage.clickLogoutButton();
//          Assert.assertTrue(loginPage.checkIfLogoutIsDisplayed());
//          Assert.assertTrue(loginPage.getAlertMessageText().contains(succesLogout));
//        }
//        @AfterMethod
//        protected void tearDown () {
//            driver.manage().deleteAllCookies();
//            driver.close();
//        }

    }





