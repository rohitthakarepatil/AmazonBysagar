// LoginPage.java
package com.qa.Pageobject.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(name="username")
    @CacheLookup
    WebElement txtUsername;

    public void setUsername(String uname) {
        txtUsername.sendKeys(uname);
    }

    @FindBy(name="password")
    @CacheLookup
    WebElement password;

    @FindBy(css = "button[type='submit'].oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    @CacheLookup
    WebElement loginButton;

    public void setPassword(String passw) {
        password.sendKeys(passw);
    }

    public void clickLoginButton() {
    	loginButton.click();
    	
    }
    @FindBy(className = "oxd-icon bi-list oxd-topbar-header-hamburger")
    @CacheLookup
    WebElement hamburgerIcon;

    public void clickHamburgerIcon() {
        hamburgerIcon.click();
    }
     @FindBy(css = "p.oxd-text.oxd-text--p[data-v-7b563373][data-v-267ef1b2]")
    @CacheLookup
    WebElement oxdTextElement;

    public void clickOxdTextElement() {
        oxdTextElement.click();
    }
  
			
	}
    

