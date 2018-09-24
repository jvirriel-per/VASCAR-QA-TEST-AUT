package com.fantasyfoot.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Tests suite that comprehend cases related to the Log In module
 *
 * @author FantasyFootball QA team
 *
 */
public class TestsLogIn extends TestsBase{

    /*SignIn URL*/
    private String beforeUrl = getBaseUrl() + "/signin";

    /**
     * Basic logging in functionality testing Expected: Redirect to workstation
     *
     * @throws Exception
     *
     */

    @Test
    public void testCorrectLogin() throws Exception{
        /*Inherited from TestBase class*/
        logIn();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        logOut();
    }

    /**
     * Basic logout functionality testing. Depends on the user to be logged in.
     * Expected: Redirect to login page
     *
     * @throws Exception
     *
     */
    @Test
    public void testSignOut() throws Exception {
        logOut();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(driver -> beforeUrl.equals(driver.getCurrentUrl()));
    }

    /**
     * Test for logging in intent with incorrect password. Expected: Error message
     *
     * @throws Exception
     *
     */
    @Test
    public void testTryingToLogInWithIncorrectPassword() throws Exception {
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(getUsername());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons){
            if ("LOG IN".equals(button.getText().trim()))button.click();
        }

    }

    /**
     * Test when leaving username field empty. Expected: Error Message
     *
     * @throws Exception
     *
     */

    @Test
    public void testTryingToLoginWithEmptyUsernameField() throws Exception {
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(getPassword());
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons){
            if ("LOG IN".equals(button.getText().trim()))button.click();
        }
    }

    /**
     *Test for intending to loggin without prompting a password. Expected: Error message
     *
     * @throws Exception
     */

    @Test
    public void testTryingToLoginWithEmptyPasswordField() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(getUsername());
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons){
            if ("LOG IN".equals(button.getText().trim()))button.click();
        }

    }

    /**
     * Test for logging in intent with an unregistered user Expected: Error message
     *
     * @throws Exception
     */
    @Test
    public void testTryingToLoginWithUsernameNotRegistered() throws Exception {
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("errorName");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(getPassword());
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons){
            if ("LOG IN".equals(button.getText().trim()))button.click();
        }

    }


}
