package com.Khansar.qa.pages;

import com.Khansar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {




    @FindBy (xpath = "//span[normalize-space()='Log In']")
    WebElement loginbutton;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement submitbutton;


   public LoginPage(){
       PageFactory.initElements(driver,this);
   }

   //actions
    public HomePage loginactions(){
        loginbutton.click();
        emailField.sendKeys(properties.getProperty("Email"));
        passwordField.sendKeys(properties.getProperty("Password"));
        submitbutton.click();
        return new HomePage();
    }

}
