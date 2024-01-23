package com.Khansar.qa.testcases;

import com.Khansar.qa.base.TestBase;
import com.Khansar.qa.pages.HomePage;
import com.Khansar.qa.pages.LoginPage;
import org.testng.annotations.*;

public class LoginPageTest extends TestBase {
    LoginPage loginPage; HomePage homePage;
    public  LoginPageTest (){
        super();
    }


    @BeforeMethod
    public void setup() {
        browsersetup();
        loginPage = new LoginPage();
    }


    @Test
    public void loginTest(){
        homePage = loginPage.loginactions();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
