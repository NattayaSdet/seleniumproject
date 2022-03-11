package com.cydeo.tests.day3_CSS_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrect");


        //to auto generate local variable WIN: alt+enter, Mac: option+enter
        //4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click the log in button.
        WebElement logInButton = driver.findElement(By.className("login-btn"));
        logInButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if(expectedErrorMessage.equals(actualErrorMessage)){
            System.out.println("Error message verification Passed!");
        }else{
            System.err.println("Error message verification ERROR!");
        }



driver.close();
    }
}
