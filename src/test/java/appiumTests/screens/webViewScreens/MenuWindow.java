package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MenuWindow extends CommonMethods {
    private AppiumDriver driver;
    private WebDriverWait wait;

    public MenuWindow(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



    public void clickOnModelXOption(){
        WebElement el = driver.findElement(By.xpath("//a[@title='Model X']"));
        wait.until(ExpectedConditions.visibilityOf(el));
        clickOnElement(el);
    }
}
