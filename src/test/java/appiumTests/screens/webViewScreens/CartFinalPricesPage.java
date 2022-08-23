package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartFinalPricesPage extends CommonMethods {
    @FindBy(how = How.XPATH, using ="//button[text()='Order with Card']")
    WebElement orderWithCardBtn;
    private AppiumDriver driver;

    public CartFinalPricesPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickOnOrderWithCard(){
        swipeNTimes(1);
        scrollIntoElement(orderWithCardBtn);
        clickOnElement(orderWithCardBtn);
    }
}
