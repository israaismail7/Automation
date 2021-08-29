import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateNewUser extends BaseTest{

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void CreateNewUser(){
        homePage.clickOnSignin();
        homePage.setMail();
        homePage.enterEmail();
        softAssert.assertEquals(createAnAccountPage.getTitle(),"YOUR PERSONAL INFORMATION", "Creation page is not loaded");
        createAnAccountPage.fillData();
        createAnAccountPage.clickOnRegisterButton();
        softAssert.assertEquals(myAccountPage.getPageTitle(),"MY ACCOUNT","My Account page is not loaded");
        softAssert.assertAll();
        homePage.clickOnSignout();
    }


}
