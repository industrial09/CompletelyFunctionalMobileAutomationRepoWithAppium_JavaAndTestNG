package appiumTests.tests;

import appiumTests.screens.MainScreen;
import appiumTests.screens.ViewsScreens.ViewsScreen;
import appiumTests.screens.ViewsScreens.ViewsTextFields;
import org.testng.annotations.Test;

public class ViewsScreenFlows extends InitializeMobileSession{
    @Test
    public void validateAbilityToEnterDataIntoTextFields(){
        MainScreen mainScreen = new MainScreen(driver);
        ViewsScreen viewsScreen = new ViewsScreen(driver);
        ViewsTextFields viewsTextFields = new ViewsTextFields(driver);
        mainScreen.tapOnViewsOption();
        viewsScreen.swipeNTimesOnScreen(2);
        viewsScreen.tapOnTextFieldsOption();
        viewsTextFields.enterData("Anything");
    }
}
