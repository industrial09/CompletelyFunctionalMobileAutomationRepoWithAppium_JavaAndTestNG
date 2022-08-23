package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartFinalPricesPage extends CommonMethods {
    private AppiumDriver driver;

    public CartFinalPricesPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnOrderWithCard(){
        WebElement el = driver.findElement(By.xpath("//button[text()='Order with Card']"));
        swipeNTimes(1);
        scrollIntoElement(el);
        clickOnElement(el);
    }
}
