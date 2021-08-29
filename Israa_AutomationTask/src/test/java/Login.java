import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login extends BaseTest {

    private String password = "12345";
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void Login() {
        homePage.clickOnSignin();
        homePage.enterLoginPassword(password);
        homePage.enterLoginMail();
        homePage.clickOnLoginButton();
        softAssert.assertEquals(myAccountPage.getPageTitle(), "MY ACCOUNT", "My Account page is not loaded");
        softAssert.assertAll();

    }

}
