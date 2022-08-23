package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CartPage extends CommonMethods {
    private WebDriverWait wait;
    private AppiumDriver driver;

    public CartPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(this.driver,30);
        //this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void clickOnContinueToPaymentBtn() throws InterruptedException {
        WebElement proceedToPaymentBtn = driver.findElement(By.xpath("(//button[@tabindex=0])[2]"));
        WebElement chargingLbl = driver.findElement(By.xpath("//h2[text()='Charging']"));
        swipeNTimes(6);
        scrollIntoElement(chargingLbl);
        Thread.sleep(2000);
        swipeNTimes(4);
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(proceedToPaymentBtn));
        scrollIntoElement(proceedToPaymentBtn);
        clickOnElement(proceedToPaymentBtn);
    }

    public void handleLanguagePreferenceOption() throws InterruptedException {
        //String loadPageState = (String) driver.executeScript("return document.readyState;");
        Thread.sleep(5000);
        WebElement el = driver.findElement(By.xpath("(//a[text()='English'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(el));
        if(el.isDisplayed()) clickOnElement(el);
    }
}
