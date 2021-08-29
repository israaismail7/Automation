import Pages.CreateAnAccountPage;
import Pages.HomePage;
import Pages.MyAccountPage;
import base.WebDriverSingleton;
import base.readerFile;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseTest {
    HomePage homePage = new HomePage();
    CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @BeforeSuite
    public void initializing() throws IOException {
        WebDriverSingleton.getInstance().setBrowser();
        WebDriverSingleton.getInstance().getDriver().get("http://automationpractice.com/index.php");
        readerFile.LoadData();
    }


}
