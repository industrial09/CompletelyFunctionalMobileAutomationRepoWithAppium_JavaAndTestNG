package appiumTests.tests;

import appiumTests.screenFlows.ViewsScreenFlows;
import org.testng.annotations.Test;

public class ViewsScreenTests extends InitializeMobileSession{
    //Make them run as a Suit
    ViewsScreenFlows viewsScreenFlows;

    @Test
    public void validateAbilityToEnterDataIntoTextFieldsField(){
        viewsScreenFlows = new ViewsScreenFlows(driver);
        viewsScreenFlows.validateAbilityToEnterDataIntoTextFields();
    }

    @Test
    public void validateAbilityToEnterDataIntoScrenTopField(){
        viewsScreenFlows = new ViewsScreenFlows(driver);
        viewsScreenFlows.validateAbilityToEnterDataIntoScreenTopField();
    }
}
