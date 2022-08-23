package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaymentSection extends CommonMethods {
    private AppiumDriver driver;

    public PaymentSection(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterPaymentData(String dataToEnter){
        WebElement el = driver.findElement(By.cssSelector("#FIRST_NAME"));
        scrollIntoElement(el);
        enterText(el, dataToEnter);
    }
}
