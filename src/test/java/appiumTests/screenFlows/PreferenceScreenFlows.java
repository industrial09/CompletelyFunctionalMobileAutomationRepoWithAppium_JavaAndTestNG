package appiumTests.screenFlows;

import appiumTests.screens.MainScreen;
import appiumTests.screens.preferenceScreens.PreferenceFromXML;
import appiumTests.screens.preferenceScreens.PreferenceScreen;
import io.appium.java_client.AppiumDriver;

public class PreferenceScreenFlows {
    MainScreen mainScreen;
    PreferenceScreen preferenceScreen;
    PreferenceFromXML preferenceFromXML;

    public PreferenceScreenFlows(AppiumDriver driver){
        mainScreen = new MainScreen(driver);
        preferenceScreen = new PreferenceScreen(driver);
        preferenceFromXML = new PreferenceFromXML(driver);
    }

    public void validateAbilityToClickOnPreferenceChkbox(){
        mainScreen.tapOnPreferenceOption();
        preferenceScreen.tapOnPreferencesFromXMLOption();
        preferenceFromXML.clickOnPreferenceChkbox();
    }
}
