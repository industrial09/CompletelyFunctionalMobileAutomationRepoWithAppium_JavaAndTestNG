package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends CommonMethods {
    @FindBy(how = How.XPATH, using ="//button[@title='Menu']")
    WebElement menuIcon;

    @FindBy(how = How.XPATH, using ="//*[text()='Tesla homepage']")
    WebElement TeslaTitle;
    WebDriverWait wait;
    private AppiumDriver driver;

    public LandingPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
         wait = new WebDriverWait(this.driver, 10);
        PageFactory.initElements(this.driver, this);
    }

    public String getTeslaLabel(){
        String TeslaName = getText(TeslaTitle);
        return TeslaName;
    }

    public void clickOnMenuIcon(){
        wait.until(ExpectedConditions.visibilityOf(menuIcon));
        clickOnElement(menuIcon);
    }
}
