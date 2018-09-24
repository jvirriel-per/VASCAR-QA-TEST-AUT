package com.fantasyfoot.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 *Test suite aiming to test all possible paths in the account creation module of the application
 *
 */

public class TestsAccountCreation extends TestsBase {

    /*SignUp URL*/
    private String beforeUrl = getBaseUrl() + "/signup";

    /**
     * This test cases is use it for checking proper behavior of Register link in the login page-
     * Expected: Change in th URL to SignUp page
     *
     * @throws Exception
     */

    @Test
    public void testRedirectToRegister() throws Exception {
        driver.get(getBaseUrl() + "/signin");
        List<WebElement> list = driver.findElements(By.tagName("li"));
        for (WebElement li : list) {
            if ("SIGN UP".equals(li.getText().trim())) li.click();
        }
    }

    @Test
    public void testRegisterMalformedEmail() throws Exception {
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("prueba.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterEmailAlreadyRegistered() throws Exception {
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterUsernameEmpty() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterEmailEmpty() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterPasswordEmpty() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterRepeatPasswordEmpty() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterPhoneEmpty() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterWithoutCountry() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterWithoutMonth() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterWithoutDay() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterWithoutYear() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterWithoutConditions() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(getEmail());
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }

    @Test
    public void testRegisterWithAllFieldsWithoutErrors() throws Exception{
        driver.get(beforeUrl);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("josevirriel123");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jvirrielcontrabass@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Repeat password']")).sendKeys("Esto123_p");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(getPhone());
        driver.findElement(By.className("select-country-box")).findElement(By.xpath("//option[@value='UK']")).click();
        driver.findElement(By.className("birthForm")).findElement(By.tagName("select")).findElement(By.xpath("//option[@value='03']")).click();
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            if ("SIGN UP".equals(button.getText().trim())) button.click();
        }
    }


}
