package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverSingleton {
    WebDriver driver;

    private static WebDriverSingleton instance = new WebDriverSingleton();

    public static WebDriverSingleton getInstance() {
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        return instance;

    }

    public void setBrowser(){
        driver=new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(1024,768));
    }

    public WebDriver getDriver()
    {
        return driver;
    }
}
