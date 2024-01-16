package com.qa.testCase.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.Amazon.utilities.ReadConfig;

public class BaseClass {

	ReadConfig read=new ReadConfig();
    public String baseUrl = read.getBaseUrl();
    public String username = read.getUsername();
    public String password = read.getPassword();
    public static WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "//Drivers//msedgedriver.exe");
        driver = new EdgeDriver();
    }
    

    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
    	driver.quit();
    
}}

