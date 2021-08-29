package Pages;

import WebElement.ObjectRepo;
import base.WebDriverSingleton;
import base.baseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {

    public void clickOnWomenSection() {
        WebDriver driver= WebDriverSingleton.getInstance().getDriver();
        Actions actions = new Actions(driver);
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_WomenSection);
        actions.moveToElement(driver.findElement(ObjectRepo.MyAccountPage_WomenSection)).click().perform();
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_BlousesSubcategory);
        WebElement Blouses = driver.findElement(ObjectRepo.MyAccountPage_BlousesSubcategory);
        actions.moveToElement(Blouses).click().perform();
    }
    public String getSectionName() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_SectionName);
        return baseActions.getTextOfElement(baseActions.getElement(ObjectRepo.MyAccountPage_SectionName));
    }
    public void clickOnAddToCart() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_AddToCart);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.MyAccountPage_AddToCart).click();
    }
    public void clickOnProceedToCheckoutPopup() throws InterruptedException {
        Thread.sleep(1000);
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_ProceedToCheckoutButtonPopup);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.MyAccountPage_ProceedToCheckoutButtonPopup).click();
    }
    public String checkoutPopUpTitle() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_checkoutPopUp);
        return baseActions.getTextOfElement(baseActions.getElement(ObjectRepo.MyAccountPage_checkoutPopUp));
    }
    public void clickOnProceedToCheckout() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_ProceedToCheckoutButton);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.MyAccountPage_ProceedToCheckoutButton).click();
    }
    public void clickOnCheckBox() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_checkBox);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.MyAccountPage_checkBox).click();
    }
    public String getQuantity() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_Quantity);
        return baseActions.getTextOfElement(baseActions.getElement(ObjectRepo.MyAccountPage_Quantity));
    }
    public String getBlouseInTheCart() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_BlouseInTheCart);
        return baseActions.getTextOfElement(baseActions.getElement(ObjectRepo.MyAccountPage_BlouseInTheCart));
    }
    public void clickOnBankWireBTN() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_BankWireBTN);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.MyAccountPage_BankWireBTN).click();
    }
    public void clickOnConfirmOrderBTN() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_ConfirmOrderBTN);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.MyAccountPage_ConfirmOrderBTN).click();
    }
    public String getOrderReference() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_OrderReference);
        return baseActions.getTextOfElement(baseActions.getElement(ObjectRepo.MyAccountPage_OrderReference));
    }

    public void clickOnUserProfile() {
        baseActions.checkPresenceOf(ObjectRepo.HomePage_UserProfile);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.HomePage_UserProfile).click();
    }

    public void clickOnOrderHistoryBTN() {
        baseActions.checkPresenceOf(ObjectRepo.HomePage_OrderHistoryBTN);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.HomePage_OrderHistoryBTN).click();
    }

    public String getOrderHistoryNumber() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_HistoryReferenceOrderNumber);
        return baseActions.getTextOfElement(baseActions.getElement(ObjectRepo.MyAccountPage_HistoryReferenceOrderNumber));
    }
    public String getPageTitle() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_PageTitle);
        return baseActions.getTextOfElement(baseActions.getElement(ObjectRepo.MyAccountPage_PageTitle));
    }
    public String getOrderHistoryTitle() {
        baseActions.checkPresenceOf(ObjectRepo.MyAccountPage_OrderHistory);
        return baseActions.getTextOfElement(baseActions.getElement(ObjectRepo.MyAccountPage_OrderHistory));
    }


}