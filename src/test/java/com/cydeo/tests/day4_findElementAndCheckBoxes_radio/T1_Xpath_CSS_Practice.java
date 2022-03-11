package com.cydeo.tests.day4_findElementAndCheckBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Xpath_CSS_Practice {

    public static void main(String[] args) {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //1.

        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //2.
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));

        //3. href value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example>h2"));

        //XPath
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='forgot Password']"));

        //c. “E-mail” text

        WebElement email_ex1 = driver.findElement(By.xpath("//label[@for='E-mail']"));

        //d. E-mail input box
        //1.
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        //2. using xpath contains()
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        WebElement retrieveButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style=\"text-align: center;\"]"));

        //4. Verify all web elements are displayed.

        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed()" + header_ex1.isDisplayed());
        System.out.println("email_ex1.isDisplayed()" + email_ex1.isDisplayed());
        System.out.println("retrieveButton.isDisplayed()" + retrieveButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed()" + poweredByCydeoText.isDisplayed());




        //cssSelector if possible
        //First solve the task with using cssSelector only. Try to create 2 different
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible


    }
}
