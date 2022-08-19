package appiumTests.screens.preferenceScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PreferenceScreen extends CommonMethods {
    @AndroidFindBy(accessibility = "1. Preferences from XML")
    private MobileElement preferencesFromXML;

    public PreferenceScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapOnPreferencesFromXMLOption(){
        tapOnElement(preferencesFromXML);
    }
}
