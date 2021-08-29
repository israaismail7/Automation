import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PaymentAndConfirmation extends BaseTest{
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void PaymentAndConfirmation(){
        softAssert.assertEquals(myAccountPage.getQuantity(),"1", "Blouse quantity is not correct");
        softAssert.assertEquals(myAccountPage.getBlouseInTheCart(),"Blouse", "Blouse not added to cart");
        myAccountPage.clickOnBankWireBTN();
        softAssert.assertEquals(myAccountPage.getPageTitle(),"ORDER SUMMARY", "ORDER SUMMARY is not loaded");
        myAccountPage.clickOnConfirmOrderBTN();
        softAssert.assertEquals(myAccountPage.getPageTitle(),"ORDER CONFIRMATION", "ORDER CONFIRMATION is not loaded");
        String orderReference = myAccountPage.getOrderReference();
        myAccountPage.clickOnUserProfile();
        softAssert.assertEquals(myAccountPage.getPageTitle(),"MY ACCOUNT", "MY ACCOUNT is not loaded");
        myAccountPage.clickOnOrderHistoryBTN();
        softAssert.assertEquals(myAccountPage.getOrderHistoryTitle(),"ORDER HISTORY", "ORDER HISTORY is not loaded");
        String orderHistoryReference = myAccountPage.getOrderHistoryNumber();
        softAssert.assertTrue(orderReference.contains(orderHistoryReference));
        softAssert.assertAll();

    }


}
