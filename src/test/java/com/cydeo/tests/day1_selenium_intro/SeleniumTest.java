package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
        //setting up the Chrome web driver
        WebDriverManager.chromedriver().setup();

        // Create instance of the chrome driver

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = "+ pageTitle);

        if(pageTitle.equals("google")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        Thread.sleep(3000);

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

   // close a current tab that in focus
        driver.close();

   // close all browser windows opened by driver
        driver.quit();

    }
}
