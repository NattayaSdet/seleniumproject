package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1Practice {

    private static WebDriver driver;

    public static void main(String[] args) {

        forEachVerification("https://Practice.cydeo.com");


        verifyingURL("cydeo");


        verificationTitle("Practice");

        driver.close();

        driver.quit();

    }


    private static void verificationTitle(String expectedWord) {

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed");

        }else{
            System.out.println("Failed");
        }

    }

    private static void verifyingURL(String expectedWord) {

        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("Passed");

        }else{
            System.out.println("Failed");
        }

    }
    private static void forEachVerification(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }



}
