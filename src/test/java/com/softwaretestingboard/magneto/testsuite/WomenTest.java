package com.softwaretestingboard.magneto.testsuite;

import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.WomenPage;
import com.softwaretestingboard.magneto.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    HomePage homepage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        // Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();

        // Mouse Hover on Tops
        homepage.mouseHoverOnTops();

        //Click on Jackets
        homepage.clickOnJackets();

        // Verify the products name display in alphabetical order
        Assert.assertEquals(womenPage.productListAfterSorting(), womenPage.productListBeforeSorting());

    }


    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        // Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenMenu();

        // Mouse Hover on Tops
        homepage.mouseHoverOnTops();

        //Click on Jackets
        homepage.clickOnJackets();

        // Verify the products price display in Low to High
        Assert.assertEquals(womenPage.priceListAfterSorting(), womenPage.priceListBeforeSorting());


    }


}
