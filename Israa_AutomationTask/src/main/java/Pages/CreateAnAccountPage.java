package Pages;

import WebElement.ObjectRepo;
import base.WebDriverSingleton;
import base.baseActions;
import base.readerFile;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage {
    public String getTitle(){
        baseActions.checkPresenceOf(ObjectRepo.CreateAnAccountPAge_YourPresonalInformationTitle);
     return baseActions.getTextOfElement( baseActions.getElement(ObjectRepo.CreateAnAccountPAge_YourPresonalInformationTitle));
    }

    public void selectGender(){
        baseActions.checkPresenceOf(ObjectRepo.CreateAnAccountPage_SelectGender);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.CreateAnAccountPage_SelectGender).click();
    }
    public void fillTextField(By locator, String text){
        baseActions.checkPresenceOf(locator);
        WebDriverSingleton.getInstance().getDriver().findElement(locator).clear();
        WebDriverSingleton.getInstance().getDriver().findElement(locator).sendKeys(text);
    }
    public void selectDropdown(By locator, String text){
        Select dropDownElement = new Select(baseActions.getElement(locator));
        dropDownElement.selectByVisibleText(text);
    }

    public void fillData(){
        selectGender();
        fillTextField(ObjectRepo.CreateAnAccountPage_FirstNameField,readerFile.FIRSTNAME);
        fillTextField(ObjectRepo.CreateAnAccountPage_LastNameField,readerFile.LASTNAME);
        fillTextField(ObjectRepo.CreateAnAccountPage_PasswordField,readerFile.PASSWORD);
        selectDropdown(ObjectRepo.CreateAnAccountPage_DayDateOfBirth,readerFile.DAYS);
        selectDropdown(ObjectRepo.CreateAnAccountPage_MonthDateOfBirth,readerFile.MONTHS);
        selectDropdown(ObjectRepo.CreateAnAccountPage_YearDateOfBirth,readerFile.YEARS);
        fillTextField(ObjectRepo.CreateAnAccountPageAddressInfo_AddressOneField,readerFile.ADDRESS);
        fillTextField(ObjectRepo.CreateAnAccountPageAddressInfo_CityField,readerFile.CITY);
        selectDropdown(ObjectRepo.CreateAnAccountPage_State,readerFile.STATES);
        fillTextField(ObjectRepo.CreateAnAccountPageAddressInfo_PostCodeField,readerFile.ZIP);
        selectDropdown(ObjectRepo.CreateAnAccountPage_Country,readerFile.COUNTRY);
        fillTextField(ObjectRepo.CreateAnAccountPageAddressInfo_MobilePhoneField,readerFile.MOBILENUMDER);
        fillTextField(ObjectRepo.CreateAnAccountPageAddressInfo_AliasField,readerFile.ALIAS);

    }
    public void clickOnRegisterButton(){
        baseActions.checkPresenceOf(ObjectRepo.CreateAnAccountPage_RegisterButton);
        WebDriverSingleton.getInstance().getDriver().findElement(ObjectRepo.CreateAnAccountPage_RegisterButton).click();
    }

}
