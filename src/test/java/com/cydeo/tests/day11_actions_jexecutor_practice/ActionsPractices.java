package com.cydeo.tests.day11_actions_jexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    //TC #4: Scroll practice
    //1- Open a Chrome browser
    //2- Go to: https://practice.cydeo.com/

    @Test
    public void task4(){
        Driver.getDriver().get("https://practice.cydeo.com/");

        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.moveToElement(cydeoLink).perform();

        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();


    }
    private static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {

        }
        return driver;
    }
    public static void closeDriver(){

        if(driver!= null){
            driver.quit();
            driver = null;

        }
    }



   /* @Test
    public void task_4_and_5_test() {
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        Actions actions = new Actions(Driver.getDriver());

        // Create object of actions and pass our "driver" instance
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();

        //5- Scroll back up to "Home" link using PageUp button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

    }

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

        }
        return driver;
    }

       This method will make our driver value is always null after using quit() method

        public static void closeDriver() {
            if (driver != null) {
                driver.quit();  //this line will terminate the existing session. value will not even be null
                driver = null;
            }
        }
*/
}

