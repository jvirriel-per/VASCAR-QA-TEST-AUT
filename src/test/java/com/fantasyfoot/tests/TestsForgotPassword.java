package com.fantasyfoot.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestsForgotPassword extends TestsBase{

    /*Forgot password URL*/
    private String beforeUrl = getBaseUrl() + "/forgotpassword";

    @Test
    public void testRedirectToForgotPassword() throws Exception{
        driver.get(getBaseUrl() + "/signin");
        driver.findElement(By.className("forgot-password")).click();
        /*Checking URL*/
        assertTrue(beforeUrl.equals(driver.getCurrentUrl()));
    }

    /**
     * Test for Forgot Password with correct email. Expected: Send the link for change password
     *
     */
    @Test
    public void testForgotPasswordWithCorrectEmail() throws Exception{
    driver.get(beforeUrl);
    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("RESET PASSWORD".equals(button.getText().trim()))button.click();
        }
    }

    /**
     * Test for Forgot Password with incorrect email. Expected: Error message
     *
     */
    @Test
    public void testForgotPasswordWithIncorrectEmail() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jose.virriel@testing.com");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("RESET PASSWORD".equals(button.getText().trim()))button.click();
        }
    }

    /**
     * Test for Forgot Password with email field empty. Expected: Error message
     */
    @Test
    public void testForgotPasswordWithEmailFieldEmpty() throws Exception {
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("RESET PASSWORD".equals(button.getText().trim()))button.click();
        }
    }
}
