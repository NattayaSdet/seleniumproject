package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @Test (priority = 1)
    public void test1() {
        System.out.println("Test 1 is running....");


        //Assert equals: compares 2 of the same things
        String actual = "apple";
        String expected = "apple2";

        Assert.assertEquals(actual,expected);

    }

    @Test (priority = 2) // can be any numbers negative, zero, positive or numbers with operators
    public void test2(){
        System.out.println("Test 2 is running....");

        //AssertTrue: compares 2 of same type
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));


    }



    @BeforeClass
    public void setupMethod(){
        System.out.println("---> Before Class is running 1 time!");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("--->After Class is running 1 time");

    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> Before method is running!");

    }

    @AfterMethod
    public void teardown(){
        System.out.println("---> AfterMethod is running!");

    }

    }









