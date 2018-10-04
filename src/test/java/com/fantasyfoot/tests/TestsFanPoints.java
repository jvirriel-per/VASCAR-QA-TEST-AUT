package com.fantasyfoot.tests;

import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestsFanPoints extends TestsBase{

    private String loginUrl = getBaseUrl() + "/fanpoints";

    @Test
    public void testLogin()throws Exception{
        logIn();
    }
    /*ALL TESTS HERE*/

    @Test
    public void testLogOut() throws Exception{
        logOut();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(driver -> loginUrl.equals(driver.getCurrentUrl()));
    }
}