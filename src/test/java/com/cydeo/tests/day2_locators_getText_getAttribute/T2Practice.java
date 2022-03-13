package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2Practice {

    private static WebDriver driver;

    public static void main(String[] args) {

        forEachVerification("https://practice.cydeo.com");

       // driver.findElement(By.linkText())

        abTextLink("A/B Testing");

        //4- Verify title is:
        //Expected: No A/B Test
        verifyingTitle("No A/B Test");

        //5- Go back to home page by using the .back();

        navigateBack();

        //6- Verify title equals:
        //Expected: Practice

        verifyingTitle2("Practice");

        driver.close();

    }

    private static void verifyingTitle2(String title2) {
        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();

        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED!");
        }

    }

    private static void navigateBack() {
        driver.navigate().back();
    }

    private static void verifyingTitle(String expectedWord) {
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();;

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

    }

    private static void abTextLink(String linkText) {
        WebElement abTextLink = driver.findElement(By.linkText("A/B Testing"));
        abTextLink.click();

    }

    private static void forEachVerification(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
    }


}
