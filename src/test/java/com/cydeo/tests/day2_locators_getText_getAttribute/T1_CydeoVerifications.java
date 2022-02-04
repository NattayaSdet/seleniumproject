package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://Practice.cydeo.com");

        String expectedURL = "cydeo";

        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.equals(expectedURL)){
            System.out.println("current URL is as expected : Verification PASSED!");
        }else{
            System.err.println("Current URL is not as expected : Verification FAILED!");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification: PASSED!");
        }else {
            System.err.println("Title verification : FAILED!");
        }



        driver.close();



    }
}


/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practice
 */