package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4Practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement userName = driver.findElement(By.className("form-control"));
        userName.sendKeys("incorrect@email.com");

        WebElement passWord = driver.findElement(By.id("inputPassword"));
        passWord.sendKeys("incorrect password");

        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        String expectedText = "Sorry, Wrong Email or Password";
        String actualText = driver.findElement(By.className("mb-4")).getText();

        if(actualText.equals(expectedText)){
            System.out.println("PASSED!");

        }else {
            System.out.println("FAILED!!");
        }
   driver.close();
    }
}
/*TC #4: Library verifications
1. Open Chrome browser
2. Go to https://library2.cybertekschool.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Verify: visually “Sorry, Wrong Email or Password”
displayed
PS: Locate username input box using “className” locator
Locate password input box using “id” locator
Locate Sign in button using “tagName” locator

 */