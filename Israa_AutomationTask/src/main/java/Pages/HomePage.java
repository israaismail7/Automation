package Pages;

import WebElement.ObjectRepo;
import base.WebDriverSingleton;
import base.baseActions;
import org.openqa.selenium.Keys;

public class HomePage {
    private static String mail;

    public void setMail() {
          mail = baseActions.generateRandomString();
    }

   public void clickOnSignin(){
       baseActions.checkPresenceOf(ObjectRepo.HomePage_LoginButton);
       WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.HomePage_LoginButton).click();
   }

   public void enterEmail (){
       baseActions.checkPresenceOf(ObjectRepo.HomePage_EmailField);
       WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.HomePage_EmailField).sendKeys(mail, Keys.ENTER);
   }
    public void clickOnSignout(){
        baseActions.checkPresenceOf(ObjectRepo.HomePage_LogOutButton);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.HomePage_LogOutButton).click();
    }
    public void enterLoginMail (){
        baseActions.checkPresenceOf(ObjectRepo.HomePage_LoginEmailField);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.HomePage_LoginEmailField).sendKeys(mail);
    }
    public void enterLoginPassword (String password){
        baseActions.checkPresenceOf(ObjectRepo.HomePage_LoginPasswordField);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.HomePage_LoginPasswordField).sendKeys(password);
    }
    public void clickOnLoginButton() {
        baseActions.checkPresenceOf(ObjectRepo.HomePage_LoginButtonField);
       WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.HomePage_LoginButtonField).click();
    }

}
