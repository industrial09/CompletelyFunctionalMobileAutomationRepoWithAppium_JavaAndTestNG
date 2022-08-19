package appiumTests.screens.ViewsScreens;

import appiumTests.screens.CommonMethods;
import framework.base.Drivercontext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ViewsTextFields extends CommonMethods {
    @AndroidFindBy(className = "android.widget.EditText")
    private MobileElement hintText;

    public ViewsTextFields(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterData(String dataToEnter){
        enterText(hintText, dataToEnter);
    }
}
