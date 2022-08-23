package appiumTests.screens.webViewScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentSection extends CommonMethods {
    @FindBy(how = How.CSS, using ="#FIRST_NAME")
    WebElement firstNameTxt;
    private AppiumDriver driver;

    public PaymentSection(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void enterPaymentData(String dataToEnter){
        scrollIntoElement(firstNameTxt);
        enterText(firstNameTxt, dataToEnter);
    }
}
