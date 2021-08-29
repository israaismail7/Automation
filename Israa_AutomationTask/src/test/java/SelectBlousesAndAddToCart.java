import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SelectBlousesAndAddToCart extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void SelectBlousesAndAddToCart() throws InterruptedException{
        myAccountPage.clickOnWomenSection();
        softAssert.assertEquals(myAccountPage.getSectionName(), "BLOUSES ", "Blouses section is not displayed");
        myAccountPage.clickOnAddToCart();
        softAssert.assertEquals(myAccountPage.checkoutPopUpTitle(),"Blouse", "Checkout popup is not displayed");
        myAccountPage.clickOnProceedToCheckoutPopup();
        softAssert.assertTrue(myAccountPage.getPageTitle().contains("SHOPPING-CART SUMMARY"),"SHOPPING-CART SUMMARY is not loaded");
        myAccountPage.clickOnProceedToCheckout();
        softAssert.assertEquals(myAccountPage.getPageTitle(),"ADDRESSES", "ADDRESSES is not loaded");
        myAccountPage.clickOnProceedToCheckout();
        softAssert.assertEquals(myAccountPage.getPageTitle(),"SHIPPING", "SHIPPING is not loaded");
        myAccountPage.clickOnCheckBox();
        myAccountPage.clickOnProceedToCheckout();
        softAssert.assertAll();

    }
}
