package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {


        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        WebDriver driver;

    @BeforeMethod
    @Test
    public void dropDownTest5() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");


        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3. Select Illinois
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        stateDropdown.selectByValue("VA");

        //5. Select California
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)
        String expectedOption = "California";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption);
    }
    @Test
    public void dropdown_task6() {

        //TC #6: Selecting date on dropdown and verifying
        //3. Select “December 1st, 1923” and verify it is selected.
        Select yearDropDown = new Select(driver.findElement(By.xpath(("//select[@id='year']"))));
        Select monthDropDown = new Select(driver.findElement(By.xpath(("//select[@id='month']"))));
        Select dayDropDown = new Select(driver.findElement(By.xpath(("//select[@id='day']"))));

        //Select year using  : visible text
        yearDropDown.selectByVisibleText("1923");

        //Select month using   : value attribute
        monthDropDown.selectByValue("11");
        //Select day using : index number
        dayDropDown.selectByIndex(0);  // index starts from 0

        //creating expected values
        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from Chrome browser
        String actualYear = yearDropDown.getFirstSelectedOption().getText();
        String actualMonth = yearDropDown.getFirstSelectedOption().getText();
        String actualDay = yearDropDown.getFirstSelectedOption().getText();

        //create assertions  //at==short cut for assertTrue()
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertTrue(actualMonth.equals(expectedMonth));
        Assert.assertTrue(actualDay.equals(expectedDay));


    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}









