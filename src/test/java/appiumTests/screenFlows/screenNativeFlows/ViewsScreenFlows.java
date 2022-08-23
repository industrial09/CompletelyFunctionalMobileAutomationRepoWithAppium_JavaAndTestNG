package appiumTests.screenFlows.screenNativeFlows;

import appiumTests.screens.nativeScreens.MainScreen;
import appiumTests.screens.nativeScreens.viewsScreens.AutoComplete;
import appiumTests.screens.nativeScreens.viewsScreens.AutoCompleteScreenTop;
import appiumTests.screens.nativeScreens.viewsScreens.ViewsScreen;
import appiumTests.screens.nativeScreens.viewsScreens.ViewsTextFields;
import io.appium.java_client.AppiumDriver;

public class ViewsScreenFlows{
    MainScreen mainScreen;
    ViewsScreen viewsScreen;
    ViewsTextFields viewsTextFields;

    AutoComplete autoComplete;

    AutoCompleteScreenTop autoCompleteScreenTop;
    public ViewsScreenFlows(AppiumDriver driver){
        mainScreen = new MainScreen(driver);
        viewsScreen = new ViewsScreen(driver);
        viewsTextFields = new ViewsTextFields(driver);
        autoComplete = new AutoComplete(driver);
        autoCompleteScreenTop = new AutoCompleteScreenTop(driver);
    }

    public void validateAbilityToEnterDataIntoTextFields(){
        mainScreen.tapOnViewsOption();
        viewsScreen.swipeNTimesOnScreen(2);
        viewsScreen.tapOnTextFieldsOption();
        viewsTextFields.enterData("Anything");
    }

    public void validateAbilityToEnterDataIntoScreenTopField(){
        mainScreen.tapOnViewsOption();
        viewsScreen.tapOnAutoCompleteOption();
        autoComplete.tapOnScreenTopOption();
        autoCompleteScreenTop.enterData("Anything");
    }
}
