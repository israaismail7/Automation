package WebElement;

import org.openqa.selenium.By;

public class ObjectRepo {
    // Home Page
    public static By HomePage_LoginButton = By.xpath("//a[@class='login']");
    public static By HomePage_EmailField  = By.id("email_create");
    public static By HomePage_LogOutButton = By.xpath("//a[@class='logout']");
    public static By HomePage_LoginEmailField  = By.id("email");
    public static By HomePage_LoginPasswordField  = By.id("passwd");
    public static By HomePage_LoginButtonField  = By.xpath("//i[@class='icon-lock left']");
    public static By HomePage_UserProfile  = By.xpath("//a[@class='account']");
    public static By HomePage_OrderHistoryBTN  = By.xpath("//i[@class='icon-list-ol']");


    // Create Account Page
    public static By CreateAnAccountPAge_YourPresonalInformationTitle = By.xpath("//h3[contains(.,'Your personal information')]");
    public static By CreateAnAccountPage_SelectGender = By.id("uniform-id_gender2");
    public static By CreateAnAccountPage_FirstNameField = By.id("customer_firstname");
    public static By CreateAnAccountPage_LastNameField = By.id("customer_lastname");
    public static By CreateAnAccountPage_PasswordField = By.id("passwd");
    public static By CreateAnAccountPage_DayDateOfBirth = By.id("days");
    public static By CreateAnAccountPage_MonthDateOfBirth = By.id("months");
    public static By CreateAnAccountPage_YearDateOfBirth = By.id("years");
    public static By CreateAnAccountPage_State = By.id("id_state");
    public static By CreateAnAccountPage_Country = By.id("id_country");
    public static By CreateAnAccountPageAddressInfo_AddressOneField = By.id("address1");
    public static By CreateAnAccountPageAddressInfo_CityField = By.id("city");
    public static By CreateAnAccountPageAddressInfo_PostCodeField = By.id("postcode");
    public static By CreateAnAccountPageAddressInfo_MobilePhoneField = By.id("phone_mobile");
    public static By CreateAnAccountPageAddressInfo_AliasField = By.id("alias");
    public static By CreateAnAccountPage_RegisterButton = By.id("submitAccount");

    // My Account Page
    public static By MyAccountPage_PageTitle = By.xpath("//h1[@class='page-heading']");
    public static By MyAccountPage_WomenSection = By.xpath("//a[@class='sf-with-ul']");
    public static By MyAccountPage_BlousesSubcategory = By.xpath("//a[contains(.,'Blouses')]");
    public static By MyAccountPage_AddToCart = By.xpath("//*[@data-id-product='2']");
    public static By MyAccountPage_SectionName = By.xpath("//span[@class='cat-name']");
    public static By MyAccountPage_ProceedToCheckoutButtonPopup = By.xpath("//a[@class='btn btn-default button button-medium']");
    public static By MyAccountPage_checkoutPopUp = By.xpath("//span[@class='product-name'][contains(.,'Blouse')]");
    public static By MyAccountPage_ProceedToCheckoutButton = By.xpath("(//span[contains(.,'Proceed to checkout')])[2]");
    public static By MyAccountPage_checkBox = By.id("cgv");
    public static By MyAccountPage_Quantity = By.xpath("//td[@class='cart_quantity text-center'][contains(.,'1')]");
    public static By MyAccountPage_BlouseInTheCart = By.xpath("//p[@class='product-name'][contains(.,'Blouse')]");
    public static By MyAccountPage_BankWireBTN = By.xpath("//a[@class='bankwire'][contains(.,'Pay by bank wire ')]");
    public static By MyAccountPage_ConfirmOrderBTN = By.xpath("//span[contains(.,'I confirm my order')]");
    public static By MyAccountPage_OrderReference = By.xpath("//div[@class='box']");
    public static By MyAccountPage_HistoryReferenceOrderNumber = By.xpath("//a[@class='color-myaccount']");
    public static By MyAccountPage_OrderHistory = By.xpath("//h1[@class='page-heading bottom-indent']");


}
