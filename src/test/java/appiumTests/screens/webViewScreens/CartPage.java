package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CartPage extends CommonMethods {
    @FindBy(how = How.XPATH, using ="(//a[text()='English'])[1]")
    WebElement englishLanguageOption;

    @FindBy(how = How.XPATH, using ="(//button[@tabindex=0])[2]")
    WebElement proceedToPaymentBtn;

    @FindBy(how = How.XPATH, using ="//h2[text()='Charging']")
    WebElement chargingLabel;
    private WebDriverWait wait;
    private AppiumDriver driver;

    public CartPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(this.driver,30);
        PageFactory.initElements(this.driver, this);
        //this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void clickOnContinueToPaymentBtn() throws InterruptedException {
        swipeNTimes(6);
        scrollIntoElement(chargingLabel);
        Thread.sleep(2000);
        swipeNTimes(4);
        Thread.sleep(2000);
        swipeNTimes(2);
        wait.until(ExpectedConditions.visibilityOf(proceedToPaymentBtn));
        scrollIntoElement(proceedToPaymentBtn);
        clickOnElement(proceedToPaymentBtn);
    }

    public void handleLanguagePreferenceOption() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(englishLanguageOption));
        if(englishLanguageOption.isDisplayed()) clickOnElement(englishLanguageOption);
    }
}
