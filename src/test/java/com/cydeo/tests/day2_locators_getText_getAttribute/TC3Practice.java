package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3Practice {

    private static WebDriver driver;

    public static void main(String[] args) {
        // 1- Open a Chrome browser
        // 2- Go to: https://google.com/
        forEachVerification("https://www.google.com");


        //3- Write “apple” in search box
        //4- Click google search button

        writeThenClickSearchBox("word");


        //5- Verify title:
        //Expected: Title should start with “apple” word

        verificationTitle("word");

    driver.quit();
    }

    private static void writeThenClickSearchBox(String inputWord) {
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

    }

    private static void verificationTitle(String word) {
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if(expectedTitle.startsWith(actualTitle)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!!");
        }

    }

    private static void forEachVerification(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);



    }
}
