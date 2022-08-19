package appiumTests.screens;

import framework.base.Drivercontext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MainScreen extends CommonMethods {
    @AndroidFindBy(accessibility = "Accessibility")
    private MobileElement access;

    @AndroidFindBy(accessibility = "Views")
    private MobileElement views;

    public MainScreen(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapOnViewsOption(){
        tapOnElement(views);
    }
}
