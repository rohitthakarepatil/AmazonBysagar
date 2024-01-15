// TC_Login_001.java
package com.qa.testCase.Amazon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.Pageobject.Amazon.LoginPage;

public class TC_Login_001 extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        LoginPage lp = new LoginPage(driver);
        lp.setUsername(username);
        lp.setPassword(password);
        Thread.sleep(5000);

        lp.clickLoginButton();
        Thread.sleep(5000);

     // Handle alert if it appears after successful login
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            Assert.assertTrue(alertText.contains("Your success message"), "Unexpected alert message");
            alert.accept();
        } catch (NoAlertPresentException e) {
            // No alert present, continue with the test
        }

        // Assuming you are checking for a successful login title
        if (driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
            Assert.assertTrue(true, "Successfully navigated to the dashboard");
        } else {
            Assert.fail("Failed to navigate to the dashboard");
        }
        lp.clickOxdTextElement();

    

        
        // Assuming you are checking for a successful login title
//        if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {
//            Assert.assertTrue(true);
//        } else {
//            Assert.assertTrue(false);
//        }
        
        // Check if the current URL is the Facebook login page

//        if (driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
//            Assert.assertTrue(true, "Successfully navigated to the Facebook login page");
//        } else {
//            Assert.fail("Failed to navigate to the Facebook login page");
//        }
    }
    
}
