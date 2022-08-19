package appiumTests.screens.viewsScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AutoComplete extends CommonMethods {
    @AndroidFindBy(accessibility = "1. Screen Top")
    private MobileElement screenTopOption;


    public AutoComplete(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapOnScreenTopOption(){tapOnElement(screenTopOption);}
}
