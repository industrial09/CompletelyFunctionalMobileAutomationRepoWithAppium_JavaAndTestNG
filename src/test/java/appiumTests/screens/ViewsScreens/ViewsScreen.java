package appiumTests.screens.ViewsScreens;

import appiumTests.screens.CommonMethods;
import framework.base.Drivercontext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ViewsScreen extends CommonMethods {
    @AndroidFindBy(accessibility = "TextFields")
    private MobileElement textFields;

    public ViewsScreen(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void swipeNTimesOnScreen(int nTimesToSwipe){
        swipeNTimes(nTimesToSwipe);
    }

    public void tapOnTextFieldsOption(){
        tapOnElement(textFields);
    }
}
