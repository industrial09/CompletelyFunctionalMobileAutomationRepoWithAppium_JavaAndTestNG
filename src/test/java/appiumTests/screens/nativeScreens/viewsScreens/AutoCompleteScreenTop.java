package appiumTests.screens.nativeScreens.viewsScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AutoCompleteScreenTop extends CommonMethods {
    @AndroidFindBy(id = "io.appium.android.apis:id/edit")
    private MobileElement txtCountry;

    public AutoCompleteScreenTop(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterData(String dataToEnter){
        enterText(txtCountry, dataToEnter);
    }
}
