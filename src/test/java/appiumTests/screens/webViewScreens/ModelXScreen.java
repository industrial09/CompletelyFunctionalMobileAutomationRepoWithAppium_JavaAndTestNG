package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModelXScreen extends CommonMethods {
    @FindBy(how = How.XPATH, using ="//*[@id=\"tesla-hero-1733\"]/div[2]/div/section/div/a")
    WebElement orderNowBtn;
    private AppiumDriver driver;
    private WebDriverWait wait;
    public ModelXScreen(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
        PageFactory.initElements(this.driver, this);
    }

    public void clickOnOrderNowBtn(){
        wait.until(ExpectedConditions.visibilityOf(orderNowBtn));
        clickOnElement(orderNowBtn);
    }
}
