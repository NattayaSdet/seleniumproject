package com.cydeo.tests.day8_properties_conflig_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){

        //key=value
        //0s.name = Mac OS X
        // user.name = cybertekchicago-1
        System.out.println("System.getProperties(\"os.name\") = " + System.getProperty("os.name"));

        System.out.println("System.getProperties(\"user.name\") = " + System.getProperty("user.name"));



    }
}
