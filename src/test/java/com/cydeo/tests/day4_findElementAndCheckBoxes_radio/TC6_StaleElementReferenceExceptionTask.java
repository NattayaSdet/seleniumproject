package com.cydeo.tests.day4_findElementAndCheckBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC6_StaleElementReferenceExceptionTask {

    public static void main(String[] args) {
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println(cydeoLink.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();
        //5- Verify it is displayed, again.
        System.out.println("cydeoLink.isDisplayed() = + " + cydeoLink.isDisplayed());


        //This is a simple StaleElementReferenceException to understand what is
        //this exception and how to handle it.

        driver.quit();
    }
}
