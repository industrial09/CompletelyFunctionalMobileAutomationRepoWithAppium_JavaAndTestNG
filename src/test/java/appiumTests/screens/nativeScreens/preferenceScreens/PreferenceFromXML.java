package appiumTests.screens.nativeScreens.preferenceScreens;

import appiumTests.screens.CommonMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PreferenceFromXML extends CommonMethods {
    private final String xpathName = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.CheckBox";
    @AndroidFindBy(xpath = xpathName)
    private List<MobileElement> prefFromXMLChkboxes;

    public PreferenceFromXML(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickOnPreferenceChkbox(){
        clickOnElement(prefFromXMLChkboxes.get(0));
    }
}
