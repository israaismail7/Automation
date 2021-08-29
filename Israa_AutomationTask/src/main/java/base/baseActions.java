package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.UUID;

public class baseActions {
    public static WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance().getDriver(),10);

    public static void checkPresenceOf(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            System.out.println("Element " + locator.toString() + " is not present on the current DOM");
        }
        }

     public static WebElement getElement(By Element){
        return WebDriverSingleton.getInstance().getDriver().findElement(Element);
     }
     public static  String getTextOfElement(WebElement Element){
        return Element.getText();
     }

    public static String generateRandomString() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.substring(0, Math.min(uuid.length(), 10))+"@yahoo.com";
        System.err.println(uuid);
        return uuid;
    }

}
