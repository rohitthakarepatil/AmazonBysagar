package com.qa.testCase.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public String username = "Admin";
    public String password = "admin123";
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

