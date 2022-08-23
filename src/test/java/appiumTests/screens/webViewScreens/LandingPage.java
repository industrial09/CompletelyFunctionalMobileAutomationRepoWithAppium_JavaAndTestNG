package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends CommonMethods {
    WebDriverWait wait;
    private AppiumDriver driver;

    public LandingPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
         wait = new WebDriverWait(this.driver, 10);
    }

    public String getTeslaLabel(){
        WebElement el = driver.findElement(By.xpath("//*[text()='Tesla homepage']"));
        String TeslaName = getText(el);
        return TeslaName;
    }

    public void clickOnMenuIcon(){
        WebElement el = driver.findElement(By.xpath("//button[@title='Menu']"));
        wait.until(ExpectedConditions.visibilityOf(el));
        clickOnElement(el);
    }
}
