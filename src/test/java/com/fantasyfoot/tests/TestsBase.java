package com.fantasyfoot.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * Base Test class for automation of regression testing
 *
 * @author FantasyFootball QA team
 *
 * */

public class TestsBase {

    /**
     * Basic Parameters for setup
     * */
    protected static WebDriver driver;
    private static String baseUrl;
    private static StringBuffer verificationErrors = new StringBuffer();
    private static String email;
    private static String username;
    private static String password;
    private static String phone;
    /**
     * Flag for logged in status
     * */
    private static boolean loggedIn;

    @BeforeClass
    public static void setUp() throws Exception{
        /*Setting up the WebDriver*/
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        username = "josevirriel";
        password = "1234567890";
        email = "jose.virriel@vascarsolutions.com";
        phone = "1-123-123-1234";
        driver = new FirefoxDriver();
        baseUrl = "https://web-dev.ffleague.co.uk";
        /*Base timeout*/
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown() throws Exception{
        /*5 Sec gap for visual verification*/
        Thread.sleep(5000);
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)){
            fail(verificationErrorString);
        }
    }

    /**
     * Helper Functions
     */

    /**
     * Helper function for login with default credentials
     */

    protected void logIn(){
        if(!loggedIn){
            driver.get(baseUrl + "/signin");
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
            List<WebElement> buttons = driver.findElements(By.tagName("button"));
            for (WebElement button : buttons){
                if ("LOG IN".equals(button.getText().trim()))button.click();
            }

            loggedIn = true;

        }
    }
    /**
     * Helper function for login out
     * */

    protected void logOut(){
        if (!loggedIn)
            logIn();
        driver.findElement(By.className("ff-header-dropdown-name"))
                .click();
        List<WebElement> list = driver.findElements(By.tagName("li"));
        for (WebElement li : list){
            if("Sign Out".equals(li.getText().trim()))li.click();
        }
        loggedIn = false;
    }



    /**
     * Getters and setters
     */

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        TestsBase.email = email;
    }
    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        TestsBase.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        TestsBase.password = password;
    }

    public String getBaseUrl() {return baseUrl;}

    public boolean isLoggedIn() {return loggedIn;}

    public static void setLoggedIn(boolean loggedIn) {TestsBase.loggedIn = loggedIn;}

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        TestsBase.phone = phone;
    }
}
