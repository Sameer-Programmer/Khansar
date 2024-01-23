package com.Khansar.qa.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
   public  WebDriver driver;
   public   Properties properties;

    protected TestBase() {

        try {
            properties = new Properties();
            FileInputStream fileInputStream1 = new FileInputStream(properties.getProperty("path"));
            properties.load(fileInputStream1);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public  void browsersetup (){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().deleteAllCookies();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get(properties.getProperty("url"));
    }


}
