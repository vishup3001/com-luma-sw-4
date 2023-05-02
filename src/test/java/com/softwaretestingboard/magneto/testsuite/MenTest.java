package com.softwaretestingboard.magneto.testsuite;

import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.MenPage;
import com.softwaretestingboard.magneto.pages.ShoppingcartPage;
import com.softwaretestingboard.magneto.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homepage = new HomePage();
    MenPage menpage = new MenPage();
    ShoppingcartPage shoppingCart = new ShoppingcartPage();


    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homepage.mouseHoverOnMenMenu();
        homepage.mouseHoverOnBottom();
        homepage.clickOnPants();

        // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
        menpage.pantSize();

        // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
        menpage.pantColour();
        menpage.addToCart();
        Assert.assertEquals(menpage.verifyAddedItemToTheShoppingCart(),"You added Cronus Yoga Pant to your shopping cart.");
        menpage.clickOnShoppingCartInMessage();
        Assert.assertEquals(shoppingCart.verifyTextShoppingCart(), "Shopping Cart");
        Assert.assertEquals(shoppingCart.verifyTheProductName(), "Cronus Yoga Pant");
        Assert.assertEquals(shoppingCart.verifyTheProductSize(), "32");
        Assert.assertEquals(shoppingCart.verifyTheProductNameColour(), "Black");


    }
}
