package com.fantasyfoot.tests;

import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestsProfile extends TestsBase{

    private String loginUrl = getBaseUrl() + "/signin";

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
