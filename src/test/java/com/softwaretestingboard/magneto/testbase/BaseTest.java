package com.softwaretestingboard.magneto.testbase;

import com.softwaretestingboard.magneto.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest extends Utility {
    String browser = "Chrome";
    @BeforeMethod
    public void setup(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }
}
