package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();
        //2- Create instance of the Selenium WebDriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //3- This line will maximize the browser size
        driver.manage().window().maximize();

        //4- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //5- get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL =  driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //6- Stop code execution for 3 seconds
        Thread.sleep(3000);

        //7- set selenium to navigate back
        driver.navigate().back();

        //8- Stop code execution for 3 seconds
        Thread.sleep(3000);

        //9- use selenium to navigate forward
        driver.navigate().forward();

        //10-Stop code execution for 3 seconds
        Thread.sleep(3000);

        //11-use selenium to navigate refresh
        driver.navigate().refresh();

        //12-Stop code execution for 3 seconds
        Thread.sleep(3000);

        //13-use navigate().to():
        driver.navigate().to("https://www.google.com");

        //14-get the current title after getting the Google page
        currentTitle = driver.getTitle();


        //15-System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        //16-Get the current URL using Selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        //17- this will close the current opened window
        driver.close();


        //18- this will close all opened windows
        driver.quit();

    }
}
