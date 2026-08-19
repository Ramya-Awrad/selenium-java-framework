package com.framework.tests;

import org.testng.annotations.Test;

import com.framework.utils.ConfigReader;

public class HomeTest extends BaseTest {

    @Test(groups = {"smoke", "regression"})
    public void homeTest() {

        System.out.println("Home test executed");

        driver.get(ConfigReader.get("url"));
    }
}